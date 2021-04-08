package com.company.io;

import java.io.*;
import java.util.List;

public class Serializer <T> implements ISerializer<T>{
    @Override
    public void serialize(T object, String path) throws IOException {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
            outputStream.writeObject(object);
        } catch (IOException e) {
            throw new IOException(e.getMessage() + "\nIOException in serialize method");
        }
    }

    @Override
    public T deserialize(String path) throws IOException, ClassNotFoundException {

        T object = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            object = (T) inputStream.readObject();
        } catch (IOException e) {
            throw new IOException(e.getMessage() + "\nIOException in deserialize method");
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(e.getMessage() + "\nClassNotFoundException in deserialize method");
        }

        return object;
    }

}

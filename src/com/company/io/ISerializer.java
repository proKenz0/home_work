package com.company.io;

import java.io.IOException;
import java.util.List;

public interface ISerializer <T> {
    void serialize(T object, String path) throws IOException;
    T deserialize(String path) throws IOException, ClassNotFoundException;
}

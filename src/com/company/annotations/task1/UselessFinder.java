package com.company.annotations.task1;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UselessFinder implements IUselessFinder{

    @Override
    public void findUselessFields(String path) {

        var clientClass = Client.class;

        var fields = Arrays.asList(clientClass.getDeclaredFields());

        List<Field> fieldsWithAnnotation = new ArrayList<>();
        for (var field : fields){
            if (field.isAnnotationPresent(Useless.class)){
                fieldsWithAnnotation.add(field);
            }
        }

        try (Writer writer = new FileWriter(path)) {
            for (var filed : fieldsWithAnnotation){
                System.out.println(filed.getName());
                writer.write(filed.getName() + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

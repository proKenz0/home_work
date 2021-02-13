package com.company.wrappers;

public class Task3 {
    Task3(){
        int rows = 5;
        int columns = 7;
        int[][] array = new int[5][7];
        int left = -2;
        int right = 75;
        for(int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                array[i][j] = (int)(Math.random()*(right-left) + left);
            }
        }
        for(int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}

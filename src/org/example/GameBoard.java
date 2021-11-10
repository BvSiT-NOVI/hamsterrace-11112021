package org.example;

import java.util.Arrays;

public class GameBoard {
    private int numRows;
    private int numColums;
    private String fieldTemplate;

    //Constructor
    public GameBoard(int numRows, int numColums, String fieldTemplate) {
        this.numRows = numRows;
        this.numColums = numColums;
        this.fieldTemplate = fieldTemplate;
    }

    public GameBoard() {
        this(3,3," |");
    }

    //Methods
    public void print(){
        for (int row = 0; row < numRows ; row++) {
             String line ="";
            for (int col = 0; col < numColums; col++) {
                line = fieldTemplate.repeat(numColums);
            }
            System.out.println(line);
        }
    }

}

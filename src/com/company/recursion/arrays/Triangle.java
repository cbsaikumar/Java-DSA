package com.company.recursion.arrays;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(4, 1);
    }

    private static void printTriangle(int row, int col) {
        if(row == 0) return;

        if(col < row) {
            System.out.print("*");
            printTriangle(row, col + 1);
        }

        if(col == row) {
            System.out.println("*");
            printTriangle(row-1, 1);
        }
    }
}

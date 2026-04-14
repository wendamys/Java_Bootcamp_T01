package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] myArray = new double[6];
        int i = 0;
        while (scanner.hasNextDouble()){
            if (scanner.hasNextDouble()) {
                myArray[i] = scanner.nextDouble();
                i++;
            } else {
                System.out.println("Error: not is numbers");
            }
        }
        for(int j = 0; j < 6; j++){

        }
    }
}
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        double[] array = InputUser();
        array = SortBySelection(array);
        PrintArray(array);
    }

    public static double[] InputUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int numberLenIsUser = scanner.nextInt();
                if (numberLenIsUser <= 0) {
                    System.out.println("Input error. Size <= 0");
                    return new double[0];
                }
                double[] myArray = new double[numberLenIsUser];
                int k = 0;
                for (int i = 0; numberLenIsUser > i; i++) {
                    if (scanner.hasNextDouble()) {
                        myArray[k] = scanner.nextDouble();
                        k++;
                    } else {
                        System.out.println("Could not parse a number. Please, try again");
                        numberLenIsUser += 1;
                        scanner.next();
                    }
                }
                return myArray;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
    }

    public static double[] SortBySelection(double[] args){
        if (args.length == 0) {
            return new double[0];

        }
        int k = 0;
        while (k < args.length-1){
            int min_idx = k;
            for (int i = k; i < args.length; i++) {
                if (args[min_idx] > args[i]) {
                    min_idx = i;
                }
            }
            double tmp = args[k];
            args[k] = args[min_idx];
            args[min_idx] = tmp;
            k++;
        }
        return args;
    }

    public static void PrintArray(double[] Array){
        System.out.println(Arrays.toString(Array));
    }
}

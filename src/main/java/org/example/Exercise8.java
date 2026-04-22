package org.example;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        int previousInput = Integer.MIN_VALUE;
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int currentInput = scanner.nextInt();
                if (previousInput == Integer.MIN_VALUE){
                    previousInput = currentInput;
                } else {
                    if (currentInput > previousInput){
                        previousInput = currentInput;
                        k++;
                    }
                    else {
                        System.out.println("The sequence is not ordered from the ordinal number of the number " + k);
                        return;
                    }
                }
            } else {
                if (previousInput != Integer.MIN_VALUE){
                    System.out.println("The sequence is ordered in ascending order");
                    return;
                }
                System.out.println("Input error");
                return;
            }
        }
    }
}

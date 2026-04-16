package org.example;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[] userArr = InputUser();
        FindMeanNegativeNumbers(userArr);
}


    public static void FindMeanNegativeNumbers(int[] userArr){
        if (userArr.length >= 1) {
            boolean negative_flag = false;
            int negative_sum = 0;
            int negative_len = 0;
            for (int i = 0; userArr.length > i; i++){
                if (userArr[i] < 0) {
                    negative_sum += userArr[i];
                    negative_len += 1;
                    negative_flag = true;
                }
            }
            if (negative_flag) {
                System.out.println(negative_sum / negative_len);
            } else {
                System.out.println("There are no negative elements");
            }
        }
    }


    public static int[] InputUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int numberLenIsUser = scanner.nextInt();
                if (numberLenIsUser <= 0) {
                    System.out.println("\tInput error. Size <= 0");
                    return new int[0];
                }
                int[] myArray = new int[numberLenIsUser];
                int k = 0;
                for (int i = 0; numberLenIsUser > i; i++) {
                    if (scanner.hasNextInt()) {
                        myArray[k] = scanner.nextInt();
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
}

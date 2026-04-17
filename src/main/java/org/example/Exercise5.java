package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] userArr = InputUser();
        DetNumberWhoseFirstAndLastMatch(userArr);
    }

    public static void DetNumberWhoseFirstAndLastMatch(int[] args) {
        if (args.length == 0) {
            return;
        }
        int first = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        int rs = 0;
        int[] result = new int[args.length];
        int[] tmp = new int[args.length];
        for (int i = 0; args.length > i; i++) {
            int k = 1;
            String num = String.valueOf(args[i]);
            for (int j = 0; num.length() > j; j++) {
                if (k == 1) {
                    first = num.charAt(j);
                    k = 0;
                }
                last = num.charAt(j);
            }
            if (first == last) {
                result[rs] = Integer.parseInt(num);
                rs++;
            }
        }
        if (Arrays.equals(result, tmp)){
            System.out.println("There are no such elements");
        } else {
            for (int i = 0; result.length > i; i++){
                if (result[i] != 0){
                    System.out.print(result[i] + " ");
                }
            }
        }
    }

    public static int[] InputUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int numberLenIsUser = scanner.nextInt();
                if (numberLenIsUser <= 0) {
                    System.out.println("Input error. Size <= 0");
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

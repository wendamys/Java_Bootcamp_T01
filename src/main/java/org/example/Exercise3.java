package org.example;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        InputUser();
    }

    public static void Recursive(long f0, long f1, long Fn, long numberIsUser, int count){
        if (numberIsUser > count) {
            Fn = f0 + f1;
            f0 = f1;
            f1 = Fn;
            count += 1;
            Recursive(f0, f1, Fn, numberIsUser, count);
        }
        else {
            System.out.println(Fn);
        }
    }

    public static void InputUser(){
        Scanner scanner = new Scanner(System.in);
        long f0 = 0;
        long f1 = 1;
        long Fn = 0;
        int count = 1;
        //0 1 1 2 3 5 8 13 21
        while (true) {
            if (scanner.hasNextInt()) {
                int numberIsUser = scanner.nextInt(); // 0, 1, 2, 3, 4
                if (numberIsUser > 50) {
                    System.out.println("\tToo large n");
                    break;
                }
                if (numberIsUser >= 0 && numberIsUser <= 1) {
                    System.out.println(numberIsUser);
                    break;
                }
                Recursive(f0, f1, Fn, numberIsUser, count);
                break;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
    }
}

package org.example;
import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class exercise0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double[] myArray = new double[6];
        int i = 0;
        while (i < 6) {
            if (scanner.hasNextDouble()) {
                myArray[i] = scanner.nextDouble();
                i++;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
        double a = Math.sqrt(Math.pow((myArray[2] - myArray[0]), 2) + Math.pow((myArray[3] - myArray[1]), 2));
        double b = Math.sqrt(Math.pow((myArray[4] - myArray[0]), 2) + Math.pow((myArray[5] - myArray[1]), 2));
        double c = Math.sqrt(Math.pow((myArray[4] - myArray[2]), 2) + Math.pow((myArray[5] - myArray[3]), 2));

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            double Perimetr = a + b + c;
            System.out.printf("Perimeter: %.3f\n", Perimetr);
        } else {
            System.out.println("It's not a triangle");
        }
    }
}
package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args){
        double[] array = ReadLineFile(InputUser());
        double[] array2 = SearchMinMax(array);
        WriteFile(array2);
    }

    public static void WriteFile(double[] array2){
        if (array2.length == 0){
            return;
        }
        Path path = Path.of("result.txt");
        try {
            String content = Arrays.stream(array2)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));
            Files.writeString(path, content);
            System.out.println("Saving min and max values in file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double[] ReadLineFile(String nameFile){
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))){
            String line = br.readLine();
            if (line == null) {
                System.out.println("Input error. File is empty");
                return new double[0];
            }

            double n_line = Double.parseDouble(line);
            if (n_line <= 0) {
                System.out.println("Input error. Size <= 0");
                return new double[0];
            }

            String next_line = br.readLine();

            String[] numArrStr = Arrays.stream(next_line.split(" "))
                    .filter(s -> !s.isBlank())
                    .toArray(String[]::new);

            ArrayList<Double> numList = new ArrayList<>();

            for (int i = 0; numArrStr.length > i; i++){
                try {
                    double number = Double.parseDouble(numArrStr[i]);
                    numList.add(number);
                }
                catch (NumberFormatException e){}
            }
            double[] numArr = numList.stream().mapToDouble(Double::doubleValue).toArray();

            if (numArr.length != Integer.parseInt(line)){
                System.out.println("Input error. Insufficient number of elements");
                return new double[0];
            }
            System.out.println(line);
            PrintLnArray(numArr);
            return numArr;

        } catch (IOException e) {
            System.out.println("Input error. File doesn't exist");
            return new double[0];
        }
    }

    public static void PrintLnArray(double[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + (i == args.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    public static double[] SearchMinMax(double[] args){
        if (args.length == 0) {
            return new double[0];
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (max < args[i]){
                max = args[i];
            }
            if (min > args[i]){
                min = args[i];
            }
        }
        args = new double[]{min, max};
        return args;
    }

    public static String InputUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}

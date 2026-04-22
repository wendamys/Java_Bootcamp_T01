package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Exercise9 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rawSize = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < rawSize; i++){
            list.add(scanner.nextLine());
        }

        String filterText = scanner.nextLine();

        filterAndPrint(list, filterText);

    }

    public static void filterAndPrint(List<String> items, String query){
        StringJoiner sj = new StringJoiner(", ");
        for (String s: items){
            if (s.contains(query)){
                sj.add(s);
            }
        }
        System.out.println(sj.toString());
    }
}

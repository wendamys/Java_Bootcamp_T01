package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        filterAndPrint(inputUser());
    }

    public static List<User> inputUser(){
        Scanner scanner = new Scanner(System.in);
        int value_users;
        while (true) {
            try {
                String number_users = scanner.nextLine();
                value_users = Integer.parseInt(number_users);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }

        List<User> list = new ArrayList<>();
        while (list.size() < value_users){
            int age;
            String name = scanner.nextLine();
            try {
                String input_age = scanner.nextLine();
                try {
                    age = Integer.parseInt(input_age);
                } catch (Exception e) {
                    System.out.println("Could not parse a number. Please, try again");
                    continue;
                }
                if (age <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                    continue;
                }
                User myUser = new User(name, age);
                list.add(myUser);
            } catch (NumberFormatException e) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }

        return list;
    }

    public static void filterAndPrint(List<User> list){
        String names = list.stream()
                .filter(u -> u.age >= 18)
                .map(u -> u.name)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }

}

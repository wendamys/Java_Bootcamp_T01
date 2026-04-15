package org.example;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 object2 = new Exercise2();
        int second = object2.userInput();
        if (second != Integer.MIN_VALUE) {
            int[] myArr = object2.SearchTimeHHMMSS(second);
            PrintTime(myArr);
        }
    }

    public int userInput(){
        Scanner scanner = new Scanner(System.in);
        int userInputSec = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                userInputSec = scanner.nextInt();
                if (userInputSec >=0) {
                    return userInputSec;
                }
                System.out.println("Incorrect time");
                return Integer.MIN_VALUE;
            } else {
                System.out.println("Could not parse a number. Please, try again");
            }
        }
    }

    public int[] SearchTimeHHMMSS(int seconds) {
        int hour = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        int[] myArr = {hour, minutes, seconds};
        return myArr;

    }

    public static void PrintTime(int[] Array){
        System.out.printf("%02d:%02d:%02d", Array[0], Array[1], Array[2]);
    }
}

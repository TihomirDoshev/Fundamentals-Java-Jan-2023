package Foundamentals.Lesson8_TextProcessing.Exercise8;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String element : inputArr) {
            char firstLetter = element.charAt(0);
            char lastLetter = element.charAt(element.length()-1);
            double number = Double.parseDouble(element.replace(firstLetter,' ').replace(lastLetter,' ').trim());

            if (Character.isUpperCase(firstLetter)){
                int firstLarge = (int) firstLetter - 64;
                number = number/ firstLarge;
            }else {
                int firstSmall = (int)firstLetter - 96;
                number =  number * firstSmall;
            }

            if (Character.isUpperCase(lastLetter)){
                int lastLarge = (int)lastLetter - 64;
                number = number -  lastLarge;
            }else {
               int lastSmall = (int)lastLetter - 96;
                number =  number +lastSmall ;
            }
            sum = sum + number;

        }
        System.out.printf("%.2f",sum);
    }
}

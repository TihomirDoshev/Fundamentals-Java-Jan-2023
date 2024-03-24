package Foundamentals.Lesson8_TextProcessing.Lection8;

import java.util.Scanner;

public class DigitsLettersOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        String  text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);

            if (Character.isDigit(currentChar)){
                digits.append(currentChar);

            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);

            }else {
                others.append(currentChar);
            }


        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}

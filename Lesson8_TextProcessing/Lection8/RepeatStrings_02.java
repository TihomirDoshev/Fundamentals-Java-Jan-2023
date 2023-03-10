package Foundamentals.Lesson8_TextProcessing.Lection8;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];
            int countChars = currentWord.length();
            for (int j = 0; j < countChars; j++) {
                sb.append(currentWord);

            }

        }
        System.out.println(sb);
    }
}

package Foundamentals.Lesson8_TextProcessing.Exercise8;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            int cryptChar = (currentChar+3);

            System.out.print((char)cryptChar);

        }
    }
}

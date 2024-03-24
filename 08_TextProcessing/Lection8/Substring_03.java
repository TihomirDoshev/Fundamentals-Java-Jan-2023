package Foundamentals.Lesson8_TextProcessing.Lection8;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  removeText = scanner.nextLine();
        String  text = scanner.nextLine();

        int index = text.indexOf(removeText);
        while (index != -1){
            text = text.replace(removeText, "");

            index = text.indexOf(removeText);


        }
        System.out.println(text);

    }
}

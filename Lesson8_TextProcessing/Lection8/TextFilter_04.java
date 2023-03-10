package Foundamentals.Lesson8_TextProcessing.Lection8;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(", ");
        String  text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < inputArr.length; i++) {
            String newWord = "";
            String currentWord = inputArr[i];
            int index = text.indexOf(currentWord);
            for (int j = 0; j < currentWord.length(); j++) {
                newWord = newWord + '*';


            }
            text = text.replace(currentWord,newWord);

        }
        System.out.println(text);
    }

}

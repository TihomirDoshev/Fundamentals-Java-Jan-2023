package Foundamentals.Lesson8_TextProcessing.Lection8;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  command = scanner.nextLine();

        while (!command.equals("end")){
            String word = "";
            for (int i = command.length()-1; i >=0 ; i--) {
                char currentChar = command.charAt(i);
                word = word + currentChar;
            }
            System.out.printf("%s = %s%n",command,word);


            command = scanner.nextLine();
        }
    }
}

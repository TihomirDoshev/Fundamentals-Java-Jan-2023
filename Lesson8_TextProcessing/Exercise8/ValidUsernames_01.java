package Foundamentals.Lesson8_TextProcessing.Exercise8;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");

        // Has a length of between 3 and 16 characters.

        for (String element : inputArr) {
            if (isValid(element)){
                System.out.println(element);
            }

        }
    }
    public static boolean isValid (String username){
        boolean size = username.length()>=3 && username.length()<=16;

        boolean content = true;
        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) &&   currentChar != '-' && currentChar !='_'){
                content= false;
            }
        }
        return size && content;
    }
}


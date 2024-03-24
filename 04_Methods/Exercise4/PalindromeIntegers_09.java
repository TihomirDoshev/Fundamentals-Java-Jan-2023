package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        while (!input.equals("END")){

            if (isPalindrome(input)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }


            input = scanner.nextLine();
        }



    }
    public static boolean isPalindrome(String text){
        String reversedText = "";
        for (int i = text.length()-1; i >=0 ; i--) {
            reversedText = reversedText + text.charAt(i);
        }
       return text.equals(reversedText);

    }
}

package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine().toLowerCase();

        printVowels(input);

    }
    public static void printVowels(String text){
        int countVowels = 0;
        for (char element:text.toCharArray()) {
            if (element == 'a' || element == 'o' || element == 'u' || element == 'e' || element == 'i') {
                countVowels++;
            }

        }
        System.out.println(countVowels);




    }
}

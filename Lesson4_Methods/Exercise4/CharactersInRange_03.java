package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharacters(symbol1,symbol2);

    }
    public static void printCharacters(char ch1, char ch2){



        if (ch1<ch2){
            for (char i = (char) (ch1+1); i  <   ch2 ; i++) {
                System.out.print(i + " ");


            }
        }else if (ch2<ch1){
            for (char i = (char) (ch2+1); i  < ch1 ; i++) {
                System.out.print(i + " ");


            }


        }

    }
}

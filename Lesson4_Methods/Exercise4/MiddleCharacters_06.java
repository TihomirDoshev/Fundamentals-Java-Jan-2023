package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        evenOrOddLength(input);




    }
    public static void evenOrOddLength(String text){
       if (text.length()%2==0){
           int middleChar1 = text.length()/2-1;
           int middleChar2 = text.length()/2;
           System.out.print(text.charAt(middleChar1));
           System.out.print(text.charAt(middleChar2));
       }else {
           int middleChar = text.length()/2;
           System.out.println(text.charAt(middleChar));
       }


    }




    }










    


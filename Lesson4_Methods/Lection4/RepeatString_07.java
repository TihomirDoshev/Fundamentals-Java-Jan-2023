package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String print =printInput(input,count);
        System.out.println(print);
    }
    Scanner scanner = new Scanner(System.in);

    public static String printInput(String text,int number){
        String newTex = "";
        for (int i = 0; i <number ; i++) {
            newTex = newTex+text;



        }
        return newTex;

    }
}

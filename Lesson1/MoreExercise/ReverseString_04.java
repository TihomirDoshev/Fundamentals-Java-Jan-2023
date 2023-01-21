package Foundamentals.Lesson1.MoreExercise;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();
        String newName = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            char currentSymbol = name.charAt(i);
            newName = newName + currentSymbol;



        }
        System.out.print(newName);
    }
}

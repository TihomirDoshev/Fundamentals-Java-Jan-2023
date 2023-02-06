package Foundamentals.Lesson2.Lection2;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character firstSymbol = scanner.nextLine().charAt(0);
        Character secondSymbol = scanner.nextLine().charAt(0);
        Character thirdSymbol = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);

    }
}

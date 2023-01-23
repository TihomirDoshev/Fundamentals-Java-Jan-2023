package Foundamentals.Lesson2.Lection2;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  firstSymbol = scanner.nextLine();
        String  secondSymbol = scanner.nextLine();
        String  thirdSymbol = scanner.nextLine();

        String result = String.format("%s%s%s",firstSymbol,secondSymbol,thirdSymbol);
        System.out.println(result);
    }
}

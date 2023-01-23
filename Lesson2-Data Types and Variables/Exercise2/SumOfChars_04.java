package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int symbol = 1; symbol <=num; symbol++) {
            Character currentSymbol = scanner.nextLine().charAt(0);
            sum = sum +currentSymbol;

        }
        System.out.println("The sum equals: "+sum);
    }
}

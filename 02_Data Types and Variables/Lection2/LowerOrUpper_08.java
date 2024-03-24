package Foundamentals.Lesson2.Lection2;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character symbol = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)){
            //или if (symbol>='A'&& symbol<='Z')

            System.out.println("upper-case");
        }else if (Character.isLowerCase(symbol)){
            //или if (symbol>='a'&& symbol <= 'z')
            System.out.println("lower-case");
        }

    }
}

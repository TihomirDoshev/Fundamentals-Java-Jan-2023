package Foundamentals.Lesson6_ObjectsAndClasses.Lection6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());

        BigInteger sum = num1.add(num2);

        System.out.println(sum);
    }
}

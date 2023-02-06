package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printMinNum(num1,num2,num3);

    }
    public static void printMinNum(int number1,int number2,int number3){
        int result = Math.min(Math.min(number1,number2),number3);
        System.out.println(result);

    }
}

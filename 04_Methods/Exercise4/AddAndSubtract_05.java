package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

       int sum = sumNumbers(num1,num2);
       int subtract = subtractNumbers(sum,num3);
        System.out.println(subtract);

    }
    public static int sumNumbers(int number1,int number2){

        return number1 + number2;
    }
    public static int subtractNumbers(int number1new,int number2new){
        return number1new-number2new;

    }
}

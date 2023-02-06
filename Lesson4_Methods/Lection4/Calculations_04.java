package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        printResult(command,num1,num2);


    }
    Scanner scanner = new Scanner(System.in);

    public static void printResult(String com,int number1,int number2) {
        switch (com){
            case "add":
                System.out.println(number1 + number2);
                break;
            case "multiply":
                System.out.println(number1 * number2);
                break;
            case "subtract":
                System.out.println(number1-number2);
                break;
            case "divide":
                System.out.println(number1 / number2);
                break;
        }

    }
}

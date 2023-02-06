package Foundamentals.Lesson4_Methods.Lection4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        String  operator = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());

        DecimalFormat df =new DecimalFormat("0.##");

        System.out.println(df.format(printTotal(num1,operator,num2)));
    }
    public static double printTotal(double number1,String operation,double number2){
        double sum = 0;
        switch (operation){
            case "/":
               sum = number1 / number2;
                break;
            case "*":
                sum = number1 * number2;
                break;
            case "+":
                sum = number1 + number2;
                break;
            case "-":
                sum = number1 - number2;
                break;

        }
        return sum;
    }
}

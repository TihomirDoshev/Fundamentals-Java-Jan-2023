package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        System.out.printf("%.2f",1.0*factNumber(num1)/factNumber(num2));

    }
    public static long factNumber(int number){
        long fact = 1;
        for (int i = 1; i <=number ; i++) {
            fact = fact * i ;

        }
        return fact;



    }
}

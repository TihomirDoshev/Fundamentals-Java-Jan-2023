package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        printInteger(numInput);

    }
    Scanner scanner = new Scanner(System.in);
    public static void  printInteger(int num){
        if (num>0){
            System.out.printf("The number %d is positive.%n",num);
        }else if (num<0){
            System.out.printf("The number %d is negative.%n",num);
        }else {
            System.out.printf("The number %d is zero.%n",num);
        }
    }

}

package Foundamentals.Lesson1.Upr1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        while (num>0){
            int lastDigit = num % 10;
            int sumFact = 1;
            for (int i = 1; i <= lastDigit; i--) {



            }
            num = num / 10;
            System.out.print(lastDigit+" ");
        }



    }
}

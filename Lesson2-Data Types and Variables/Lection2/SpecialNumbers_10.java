package Foundamentals.Lesson2.Lection2;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum =0;

        for (int i = 1; i <=n ; i++) {
            currentNum = i;

            int sum = 0;
            while (currentNum > 0){

                sum = sum +(currentNum%10);

                currentNum = currentNum /10;


            }

            if (sum == 5 || sum ==7 || sum == 11){

                System.out.println(i+" -> "+"True");
            }else {
                System.out.println(i+" -> "+"False");
            }

        }
    }
}

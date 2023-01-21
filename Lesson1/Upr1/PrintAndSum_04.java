package Foundamentals.Lesson1.Upr1;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int finNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int num = startNum; num <=finNum ; num++) {
            System.out.print(num+" ");
            sum = sum + num;


        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}

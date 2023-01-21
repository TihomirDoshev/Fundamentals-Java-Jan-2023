package Foundamentals.Lesson1.Lection1;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        // За да направим 5 итерации ,демек 1,2,3,4,5(Нечетните са 1,3,5)
        //Трябва да направин 2 * n итерации 2 * 5 = 10 ( нечетните стават 1,3,5,7,9)
        for (int i = 1; i <n*2; i++) {
            if (i%2 !=0){
                System.out.println(i);
                sum = sum + i;
            }

        }
        System.out.printf("Sum: %d",sum);
    }
}

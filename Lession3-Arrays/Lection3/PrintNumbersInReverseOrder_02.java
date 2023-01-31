package Foundamentals.Lesson3.Lection3;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[num];
        for (int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numbersArr[i]=currentNum;
        }
        for (int i = numbersArr.length-1; i >=0 ; i--) {
            System.out.printf("%d ",numbersArr[i]);

        }




        }

    }


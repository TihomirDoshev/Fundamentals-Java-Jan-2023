package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        int num = Math.abs(numInput);

        int evenSum = printEven(num);
        int oddSum = printOdd(num);
        int total = evenSum*oddSum;
        System.out.println(total);





    }
    public static int printEven(int number){
        int evenSum = 0;
        int oddSum =0;
        char[] numbersArr = (""+number).toCharArray();
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = Integer.parseInt(String.valueOf(numbersArr[i]));
            if (currentNum % 2 ==0){
                evenSum+=currentNum;
            }else {
                oddSum+=currentNum;

            }
        }
        return evenSum ;

    }
    public static int printOdd(int number){
        int evenSum = 0;
        int oddSum =0;
        char[] numbersArr = (""+number).toCharArray();
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = Integer.parseInt(String.valueOf(numbersArr[i]));
            if (currentNum % 2 ==0){
                evenSum+=currentNum;
            }else {
                oddSum+=currentNum;

            }
        }
        return oddSum ;

    }

}

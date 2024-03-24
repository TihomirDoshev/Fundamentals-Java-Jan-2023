package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int index = 0; index < numbersArr.length; index++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int left = 0; left < index; left++) {
                leftSum = leftSum+numbersArr[left];
            }
            for (int right = index+1; right <numbersArr.length ; right++) {
                rightSum = rightSum + numbersArr[right];


            }
            if (leftSum == rightSum){
                System.out.println(index);
                return;

            }

        }
        System.out.println("no");
    }
}

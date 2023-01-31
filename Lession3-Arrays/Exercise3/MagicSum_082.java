package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum1 = numbersArr[i];
            for (int j = i+1; j < numbersArr.length; j++) {
                int currentNum2 = numbersArr[j];
                if (currentNum1 + currentNum2 == num){
                    System.out.println(currentNum1+" "+currentNum2);
                }

            }

        }






        }



    }


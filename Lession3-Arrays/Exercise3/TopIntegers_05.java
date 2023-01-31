package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length; i++) {
            //14 24 3 19 15 17	// 24 19 17

            boolean isBigger = true;

            for (int j = i + 1; j < inputArr.length; j++) {

                if (inputArr[i] <= inputArr[j]) {
                    isBigger = false;
                }
            }

            if (isBigger) {
                System.out.print(inputArr[i] + " ");
            }
        }
    }
    }


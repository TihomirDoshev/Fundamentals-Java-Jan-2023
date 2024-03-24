package Foundamentals.Lesson3.Lection3;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSUm = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i]%2 ==0){
                evenSum +=numbersArr[i];

            }else {
                oddSUm += numbersArr[i];

            }

        }
        System.out.println(evenSum-oddSUm);
    }
}

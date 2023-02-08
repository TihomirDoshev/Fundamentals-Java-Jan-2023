package Foundamentals.Lesson3.Lection3;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int item:numbersArr) {
            if (item %2 == 0){
                sum +=item;

            }

        }
        System.out.println(sum);


    }
}

package Foundamentals.Lesson3.Lection3;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //4
        while (input.length > 1) {
            //3
            int[] condensed = new int[input.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
        }
        System.out.println(input[0]);

    }
}

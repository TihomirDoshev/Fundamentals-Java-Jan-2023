package Foundamentals.Lesson3.Lection3;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = input.length;

        while (counter > 1) {
            for (int i = 0; i < input.length - 1; i++){
                input[i] = input[i] + input[i + 1];
            }
            counter--;
        }
        System.out.println(input[0]);
    }
}

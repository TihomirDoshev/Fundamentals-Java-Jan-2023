package Foundamentals.Lesson8_TextProcessing.MoreExercise_08;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = (scanner.nextLine().charAt(0));
        char second = (scanner.nextLine().charAt(0));
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > Math.min(first, second) && input.charAt(i) < Math.max(first, second)) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}

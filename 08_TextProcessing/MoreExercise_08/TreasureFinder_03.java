package Foundamentals.Lesson8_TextProcessing.MoreExercise_08;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] key = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input;

        while (!"find".equals(input = scanner.nextLine())) {
            StringBuilder output = new StringBuilder();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (count == key.length) {
                    count = 0;
                }
                output.append((char) (((input.charAt(i))) - key[count]));
                count++;
            }
            System.out.printf("Found %s at %s%n", output.substring(output.indexOf("&") + 1, output.lastIndexOf("&"))
                    , output.substring(output.indexOf("<") + 1, output.lastIndexOf(">")));
        }
    }
}

package Foundamentals.Lesson8_TextProcessing.MoreExercise_08;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = (scanner.nextLine());

            System.out.printf("%s is %s years old.%n", input.substring((input.indexOf("@") + 1)
                    , input.indexOf("|")), input.substring((input.indexOf("#") + 1), input.indexOf("*")));
        }
    }
}

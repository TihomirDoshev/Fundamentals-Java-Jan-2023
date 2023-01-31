package Foundamentals.Lesson3.MoreExercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (long rows = 1; rows <= n; rows++) {
            long newNumber = 1;
            for (long columns = 1; columns <= rows; columns++) {
                System.out.print(newNumber + " ");
                newNumber = newNumber * (rows - columns) / columns;
            }
            System.out.println();
        }
    }
}

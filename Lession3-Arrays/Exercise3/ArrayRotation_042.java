package Foundamentals.Lesson3.Exercise3;

import java.util.Scanner;

public class ArrayRotation_042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String oldElement = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = oldElement;


        }
        for (String elements :array) {
            System.out.print(elements + " ");

        }
    }
}

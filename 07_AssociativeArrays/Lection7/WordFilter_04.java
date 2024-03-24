package Foundamentals.Lesson7_AssociativeArrays.Lection7;

import java.util.Arrays;
import java.util.Scanner;



public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() %2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(),inputArr));



    }
}

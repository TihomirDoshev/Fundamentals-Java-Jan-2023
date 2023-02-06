package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <=numRotations ; rotations++) {
            int firstNum = numbersArr[0];
            for (int index = 0; index <numbersArr.length-1 ; index++) {
                numbersArr[index] = numbersArr[index + 1];
            }
            numbersArr[numbersArr.length-1] = firstNum;


        }
        for (int number:numbersArr) {
            System.out.print(number + " ");
            
        }
    }
}

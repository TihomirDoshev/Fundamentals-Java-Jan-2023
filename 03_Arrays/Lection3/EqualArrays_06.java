package Foundamentals.Lesson3.Lection3;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] numbersArr2= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int index = 0;
        boolean isIdentical = true;
        for (int i = 0; i < numbersArr1.length; i++) {
            int firstNum = numbersArr1[i];
            int secondNum = numbersArr2[i];
            if (firstNum == secondNum){

                sum+=secondNum;
            }else {
                isIdentical =false;
                index=i;
                break;

            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        }
    }
}

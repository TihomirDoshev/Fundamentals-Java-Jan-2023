package Foundamentals.Lesson3.Lection3;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length/2; i++) {
            String oldValue = inputArr[i];
            inputArr[i]=inputArr[inputArr.length-1-i];
            inputArr[inputArr.length-1-i] = oldValue;

        }
        System.out.println(String.join(" ",inputArr));
    }
}

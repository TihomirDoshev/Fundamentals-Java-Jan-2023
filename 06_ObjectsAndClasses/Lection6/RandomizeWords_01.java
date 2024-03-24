package Foundamentals.Lesson6_ObjectsAndClasses.Lection6;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.nextLine();
        String [] inputArr = input.split(" ");

        Random rnd = new Random();

        for (int i = 0; i < inputArr.length; i++) {
            int firstIndex = rnd.nextInt(inputArr.length);
            int secondIndex = rnd.nextInt(inputArr.length);

            String oldValue = inputArr[firstIndex];

            inputArr[firstIndex] = inputArr[secondIndex];
            inputArr[secondIndex] = oldValue;
        }
        for (String element : inputArr) {
            System.out.println(element);

        }



    }
}

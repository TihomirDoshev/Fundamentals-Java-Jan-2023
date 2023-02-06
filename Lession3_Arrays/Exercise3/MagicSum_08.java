package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <=numbers.length-1; index++) {
            int currentNum = numbers[index];
            for (int inIndex = index + 1; inIndex <=numbers.length-1; inIndex++) {
                int inNum = numbers[inIndex];

                if (currentNum + inNum == magicNum){
                    System.out.println(currentNum + " " + inNum);
                }


            }

        }
    }
}

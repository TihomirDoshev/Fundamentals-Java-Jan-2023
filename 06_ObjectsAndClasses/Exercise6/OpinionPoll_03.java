package Foundamentals.Lesson6_ObjectsAndClasses.Exercise6;

import java.util.Scanner;

public class OpinionPoll_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String [] inputArr = scanner.nextLine().split(" ");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            if (age>30){
                System.out.println(name+" - "+age);
            }

        }
    }
}

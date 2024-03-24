package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses =(int) Math.ceil(numPeople*1.0/capacity);
        System.out.println(courses);

    }
}

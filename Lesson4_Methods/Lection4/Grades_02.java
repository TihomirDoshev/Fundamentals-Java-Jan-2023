package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numInput = Double.parseDouble(scanner.nextLine());

        printGrade(numInput);
    }
    Scanner scanner = new Scanner(System.in);

    public static void printGrade(double grade) {
        if (grade>=2.00 && grade<=2.99){
            System.out.println("Fail");
        }else if (grade>=3.00 && grade<=3.49){
            System.out.println("Poor");
        }else if (grade>=3.5 && grade<=4.49){
            System.out.println("Good");
        }else if (grade >=4.5 && grade<= 5.49){
            System.out.println("Very good");
        }else if (grade >=5.5 && grade <=6){
            System.out.println("Excellent");
        }

    }
}

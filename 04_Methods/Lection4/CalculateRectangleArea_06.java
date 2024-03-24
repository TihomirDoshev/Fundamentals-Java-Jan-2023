package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = printAreaTriangle(width,length);
        System.out.println(area);

    }
    Scanner scanner = new Scanner(System.in);

    public static int printAreaTriangle(int num1,int num2) {
        return num1 * num2;

    }
}

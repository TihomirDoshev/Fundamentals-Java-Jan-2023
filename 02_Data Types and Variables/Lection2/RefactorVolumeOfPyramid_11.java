package Foundamentals.Lesson2.Lection2;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//    double dul, sh, V = 0;
//System.out.print("Length: ");
//    dul = Double.parseDouble(scanner.nextLine());
//System.out.print("Width: ");
//    sh = Double.parseDouble(scanner.nextLine());
//System.out.print("Height: ");
//    V = Double.parseDouble(scanner.nextLine());
//    V = (dul * sh * V) / 3;
//System.out.printf("Pyramid Volume: %.2f", V);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double V = (a * b * h) / 3;
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f",V);


    }

}

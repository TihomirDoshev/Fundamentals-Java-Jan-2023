package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double kegArea = 0;
        double biggestKeg =Double.MIN_VALUE;
        String newModel ="";

        for (int i = 1; i <=num ; i++) {
            String  model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //π * r^2 * h.
            kegArea = Math.PI * Math.pow(radius,2)*height;
            if (kegArea>biggestKeg){
                biggestKeg = kegArea;
                newModel = model;

            }
        }
        System.out.println(newModel);




    }
}

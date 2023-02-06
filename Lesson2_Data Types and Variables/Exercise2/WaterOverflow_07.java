package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 1; i <=n ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum = sum + liters;
            if (sum >255){
                System.out.println("Insufficient capacity!");
                sum = sum-liters;


            }

        }
        System.out.println(sum);

    }
}

package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double newArea = Double.MIN_VALUE;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 1; i <=n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int  snowballQuality = Integer.parseInt(scanner.nextLine());

            double area = Math.pow((snowballSnow/snowballTime),snowballQuality);
            if (area>newArea){
                newArea = area;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",snow,time,newArea,quality);
    }
}

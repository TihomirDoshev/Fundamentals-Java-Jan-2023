package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());
        int newPower = powerN;
        int countPokes = 0;

        while (powerN >=distanceM){
            powerN =powerN - distanceM;
            countPokes ++ ;
            if (powerN == newPower/2){
                if (exhaustionY!=0){

                    powerN = powerN/exhaustionY;
                }
            }
        }
        System.out.println(powerN);
        System.out.println(countPokes);
    }
}

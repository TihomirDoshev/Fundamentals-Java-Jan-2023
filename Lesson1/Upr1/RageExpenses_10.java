package Foundamentals.Lesson1.Upr1;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadsets = lostGames / 2 ;
        int countMouses = lostGames / 3 ;
        int countKeyboards = lostGames / 6 ;
        int countDisplays = lostGames / 12 ;

        double sum = headsetPrice * countHeadsets + mousePrice * countMouses + keyboardPrice * countKeyboards + displayPrice * countDisplays;

        System.out.printf("Rage expenses: %.2f lv.",sum);

    }
}

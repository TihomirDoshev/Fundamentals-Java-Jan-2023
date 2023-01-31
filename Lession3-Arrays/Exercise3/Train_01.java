package Foundamentals.Lesson3.Exercise3;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int [] wagonArr = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagonArr.length; i++) {
            int currentPeople = Integer.parseInt(scanner.nextLine());
            wagonArr[i] = currentPeople;
            sum +=currentPeople;

            System.out.printf("%d ",wagonArr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}

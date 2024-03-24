package Foundamentals.Lesson1.Lection1;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = Integer.parseInt(scanner.nextLine());
        int firstMinute = Integer.parseInt(scanner.nextLine());
        int allMinutes = firstMinute+(firstHour*60)+30;
        int hour = allMinutes/60;
        int minutes = allMinutes%60;


        if (hour>23){
            hour=0;
        }
        System.out.printf("%d:%02d",hour,minutes);

    }
}

package Foundamentals.Lesson3.Lection3;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int num = Integer.parseInt(scanner.nextLine());

        if (num>=1 && num <=7){
            System.out.println(days[num-1]);
        }else{
            System.out.println("Invalid day!" );
        }


    }
}

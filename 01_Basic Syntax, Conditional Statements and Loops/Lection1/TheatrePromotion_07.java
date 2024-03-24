package Foundamentals.Lesson1.Lection1;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        String message = "";
        //boolean isValid = true;

        if (age >=0 && age <= 18){
            if (day.equals("Weekday")){
                price = 12;
            }else if (day.equals("Weekend")){
                price = 15;
            }else if (day.equals("Holiday")){
                price = 5;
            }else {
                message = "Error!";
            }

        }else if (age >18 && age <= 64){
            if (day.equals("Weekday")){
                price = 18;
            }else if (day.equals("Weekend")){
                price = 20;
            }else if (day.equals("Holiday")){
                price = 12;
            }else {
                message = "Error!";
            }

        }else if (age >64 && age <= 122){
            if (day.equals("Weekday")){
                price = 12;
            }else if (day.equals("Weekend")){
                price = 15;
            }else if (day.equals("Holiday")){
                price = 10;
            }else {
                message = "Error!";
            }

        }
        if (price !=0){
            System.out.printf("%d$",price);
        }else {
            System.out.println("Error!");
        }

        }

    }


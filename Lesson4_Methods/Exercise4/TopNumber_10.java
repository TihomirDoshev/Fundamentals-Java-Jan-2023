package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            if (isDivideBy8(i) && isContainsOddDigit(i)) {

                System.out.println(i);

            }



        }





    }
    public static boolean isDivideBy8(int number){
        int sumOfDigits= 0;
        while (number > 0){

            int lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            number = number /10;
        }
       if (sumOfDigits % 8 == 0){
           return true;
       }else {
           return false;
       }




    }
    public static boolean isContainsOddDigit(int number){
        while (number>0){
            int lastDigit = number % 10;
            if (lastDigit %2 !=0){
                return true;

            }else {
                number = number / 10;

            }
        }
        return false;

    }
}





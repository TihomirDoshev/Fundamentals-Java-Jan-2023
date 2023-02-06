package Foundamentals.Lesson4_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //•"Password must be between 6 and 10 characters";
        //•	"Password must consist only of letters and digits";
        //•	"Password must have at least 2 digits".
        if (!numOfCharacters(input)){
            System.out.println("Password must be between 6 and 10 characters");

        }
        if (!consistPassword(input)){
            System.out.println("Password must consist only of letters and digits");


        }
        if (!haveAtDigits(input)){
            System.out.println("Password must have at least 2 digits");

        }
        if (numOfCharacters(input) && consistPassword(input) && haveAtDigits(input)){
            System.out.println("Password is valid");
        }


    }

    public static boolean numOfCharacters(String text) {
        int numOfCharacters = text.length();
        if (numOfCharacters >= 6 && numOfCharacters <= 10) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean consistPassword(String text1) {
        for (char element : text1.toCharArray()) {
            if (!Character.isLetterOrDigit(element)) {
                return false;

            }

        }
        return true;
    }
    public static boolean haveAtDigits (String text2){
        int count = 0;
        for (char element : text2.toCharArray()){
            if (Character.isDigit(element)){
                count++;
            }
            if (count>=2){
                return true;
            }
        }
        return false;

    }
}


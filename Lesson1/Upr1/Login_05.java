package Foundamentals.Lesson1.Upr1;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length()-1; position  >=0 ; position --) {
            char currentSymbol = userName.charAt(position);
            password = password + currentSymbol;

        }
        String  enteredPassword = scanner.nextLine();
        int failedTries = 0;
        while (!enteredPassword.equals(password)){
            failedTries++;
            if (failedTries == 4){
                System.out.printf("User %s blocked!",userName );
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();



        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",userName );

        }



    }
}

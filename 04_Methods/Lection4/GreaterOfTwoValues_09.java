package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  method = scanner.nextLine();

        switch (method){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1,symbol2));
                break;
            case "string":
                String  name1 = scanner.nextLine();
                String  name2 = scanner.nextLine();
                System.out.println(getMax(name1,name2));
                break;
        }

    }
    public static int getMax(int first , int second){
        if (first > second){
            return first;
        }else {
            return second;
        }

    }
    public static char getMax(char first , char second){
        if (first > second){
            return first;
        }else {
            return second;
        }

    }
    public static String getMax(String first , String second){
        if (first.compareTo(second)>0){
            return first;
        }else {
            return second;
        }

    }

}

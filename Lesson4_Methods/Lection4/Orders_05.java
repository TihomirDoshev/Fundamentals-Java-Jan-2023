package Foundamentals.Lesson4_Methods.Lection4;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printSum(product,quantity);
    }
    Scanner scanner = new Scanner(System.in);
    public static void printSum(String prod,int count){
        double sum =0;
        switch (prod){
            case "coffee":
                sum = count*1.5;
                break;
            case "water":
                sum = count*1.0;
                break;
            case "coke":
                sum = count*1.4;
                break;
            case "snacks":
                sum = count*2.0;
                break;
        }
        System.out.printf("%.2f",sum);

    }
}

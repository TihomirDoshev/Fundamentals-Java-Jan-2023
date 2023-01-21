package Foundamentals.Lesson1.Exercise1;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        String  insert = scanner.nextLine();

        while (!insert.equals("Start")){
            double coin = Double.parseDouble(insert);
            //0.1, 0.2, 0.5, 1, and 2
            if (coin !=0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2){
                System.out.printf("Cannot accept %.2f%n",coin);

            }else {
                sum = sum +coin;

            }


            insert = scanner.nextLine();

        }
        String  product = scanner.nextLine();
        //"Nuts", "Water", "Crisps", "Soda", "Coke".
        //   2.0,    0.7,     1.5,     0.8,    1.0
        double price = 0;

        while (!product.equals("End")){

            if (product.equals("Nuts")){
                price = 2;
                if (sum<price){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.println("Purchased Nuts");
                    sum = sum -price;
                }

            }else if (product.equals("Water")){
                price = 0.7;
                if (sum < price){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.println("Purchased Water");
                    sum = sum - price;
                }
            }else if (product.equals("Crisps")){
                price = 1.5 ;
                if (sum < price){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.println("Purchased Crisps");
                    sum = sum - price ;
                }
            }else if (product.equals("Soda")){
                price = 0.8 ;
                if (sum < price){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.println("Purchased Soda");
                    sum = sum - price ;
                }
            }else if (product.equals("Coke")){
               price = 1 ;
               if (sum < price){
                   System.out.println("Sorry, not enough money");
               }else {
                   System.out.println("Purchased Coke");
                   sum = sum - price ;

               }

            }else {
                System.out.println("Invalid product");
            }

            product = scanner.nextLine();


        }
        System.out.printf("Change: %.2f",sum);

        }



    }



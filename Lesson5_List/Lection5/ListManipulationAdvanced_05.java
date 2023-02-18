package Foundamentals.Lesson5_List.Lection5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        String  command = scanner.nextLine();

        while (!command.equals("end")){

           if (command.contains("Contains")){
               int containNum = Integer.parseInt(command.split(" ")[1]);
               if (num.contains(containNum)){
                   System.out.println("Yes");
               }else {
                   System.out.println("No such number");
               }


           }else if (command.contains("even")){
               for (int element : num) {
                   if (element % 2 == 0){
                       System.out.print(element+" ");
                   }

               }
               System.out.println();
           }else if (command.contains("odd")){
               for (int element : num) {
                   if (element % 2 != 0){
                       System.out.print(element+" ");

                   }

               }
               System.out.println();
           }else if (command.contains("sum")){
               int sum = 0;
               for (int element : num) {
                   sum = sum+element;


               }
               System.out.println(sum);
           }else if (command.contains("Filter")){
               String condition = command.split(" ")[1];
               int number = Integer.parseInt(command.split(" ")[2]);

               if (condition.equals("<")){
                   for (int element : num) {
                       if (element < number){
                           System.out.print(element+" ");
                       }

                   }
                   System.out.println();

               }if (condition.equals(">")){
                   for (int element : num) {
                       if (element > number){
                           System.out.print(element+" ");
                       }

                   }
                   System.out.println();

               }if (condition.equals("<=")){
                   for (int element : num) {
                       if (element <= number){
                           System.out.print(element+" ");
                       }

                   }
                   System.out.println();


               }if (condition.equals(">=")){
                   for (int element : num) {
                       if (element >= number){
                           System.out.print(element+" ");
                       }

                   }
                   System.out.println();

               }

           }






            command = scanner.nextLine();

        }

    }


    }


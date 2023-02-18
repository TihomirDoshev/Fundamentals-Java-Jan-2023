package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();
        String [] numbers = input.split("\\|");
        for (int i = numbers.length-1; i >=0 ; i--) {
            String currentNumber = numbers[i].trim();
            if (currentNumber.equals(" ") || currentNumber.equals("")){
                continue;
            }
            String [] newNumbers = currentNumber.split("\\s+");
            for (String element : newNumbers) {
                System.out.print(element+" ");

            }

        }




        }
    }



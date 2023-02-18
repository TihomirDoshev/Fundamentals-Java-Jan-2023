package Foundamentals.Lesson5_List.Lection5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        String  command = scanner.nextLine();

        //Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
        //Add {number}: add a number to the end of the list
        //Remove {number}: remove a number from the list
        //RemoveAt {index}: remove a number at a given index
        //Insert {number} {index}: insert a number at a given index

        while (!command.equals("end")){
            if (command.contains("Add")){
                int addNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.add(addNumber);

            }else if (command.contains("RemoveAt")){
                int removeAtNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(removeAtNumber);

            }else if (command.contains("Remove")){
                int removeNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(removeNumber));

            }else if (command.contains("Insert")){
                int insertNumber = Integer.parseInt(command.split(" ")[1]);
                int insertIndex = Integer.parseInt(command.split(" ")[2]);
                numbers.add(insertIndex,insertNumber);
            }

            command = scanner.nextLine();

        }
        for (int element : numbers){
            System.out.print(element+" ");
        }

    }
}

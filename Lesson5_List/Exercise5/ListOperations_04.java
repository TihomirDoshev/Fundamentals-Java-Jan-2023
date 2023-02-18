package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        //•	Add {number} - add number at the end
        //•	Insert {number} {index} - insert number at given index
        //•	Remove {index} - remove that index
        //•	Shift left {count} - first number becomes last 'count' times
        //•	Shift right {count} - last number becomes first 'count' times
        //The index given may be outside the array's bounds. In that case, print "Invalid index".

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int addNumber = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(Integer.valueOf(addNumber));

            } else if (command.contains("Insert")) {

                int insertNumber = Integer.parseInt(command.split("\\s+")[1]);
                int insertIndex = Integer.parseInt(command.split("\\s+")[2]);

                if (insertIndex >= 0 && insertIndex <= numbers.size() - 1) {
                    numbers.add(insertIndex, insertNumber);
                } else {
                    System.out.println("Invalid index");

                }

            } else if (command.contains("Remove")) {
                int removeIndex = Integer.parseInt(command.split("\\s+")[1]);
                if (removeIndex >= 0 && removeIndex <= numbers.size() - 1) {
                    numbers.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");

                }

                //•	Shift left {count} - first number becomes last 'count' times
                //1 23 29 18 43 21 20
            } else if (command.contains("Shift left ")) {
                int rotation = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < rotation; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(Integer.valueOf(firstNumber));


                }

                //•	Shift right {count} - last number becomes first 'count' times
            }else if (command.contains("Shift right ")){
                int rotation = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < rotation; i++) {
                    int lastNumber = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,lastNumber);

                }


            }
            command = scanner.nextLine();
        }
        for (int element : numbers) {
            System.out.print(element+" ");

        }

    }
}


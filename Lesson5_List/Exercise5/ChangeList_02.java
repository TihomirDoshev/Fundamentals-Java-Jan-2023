package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer :: parseInt).collect(Collectors.toList());

        //•	Delete {element} - delete all elements in the array which are equal to the given element
        //•	Insert {element} {position} - insert element at the given position
        //  1 2 3 4 5 5 5 6

        String  command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Delete")){
                int deleteNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(deleteNumber));

            }else if (command.contains("Insert")){
                int insertNumber = Integer.parseInt(command.split(" ")[1]);
                int insertIndex = Integer.parseInt(command.split(" ")[2]);
                numbers.add(insertIndex,insertNumber);

            }
            command = scanner.nextLine();

        }
        for (int element : numbers){
            System.out.print(element+ " ");
        }
    }
}

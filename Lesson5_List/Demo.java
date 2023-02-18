package Foundamentals.Lesson5_List;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        //•	"swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index.
        // Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.

        String  command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstIndex =numbers.get(index1);
                numbers.set(index1,numbers.get(index2));
                numbers.set(index2,firstIndex);

            }else if (command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                numbers.set(index1, numbers.get(index1)*numbers.get(index2));

            }else if (command.contains("decrease"))
                for (int i = 0; i <= numbers.size() - 1; i++) {
                    numbers.set(i,numbers.get(i)-1);
                }

            command = scanner.nextLine();

        }
        for (int element : numbers) {
            System.out.print(element+" ");

        }


    }
    }




















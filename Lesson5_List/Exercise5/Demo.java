package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        //•	Add {passengers} - add a wagon to the end with the given number of passengers
        //•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)

        String  command = scanner.nextLine();
        while (!command.equals("end" )){

            if (command.contains("Add")){
                int newWagon = Integer.parseInt(command.split(" ")[1]);
                numbers.add(newWagon);

            }else {
                int currentPeople = Integer.parseInt(command.split(" ")[0]);

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) + currentPeople <= maxCapacity){
                        numbers.set(i,numbers.get(i) + currentPeople);
                        break;

                    }


                }

            }



            command = scanner.nextLine();

        }
        for (int element : numbers){
            System.out.print(element+" ");
        }
    }

}

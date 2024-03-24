package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String  command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")) {
                int newWagon = Integer.parseInt(command.split(" ")[1]);
                number.add(newWagon);
            }else{
                int currentPeople = Integer.parseInt(command.split(" ")[0]);
                for (int i = 0; i < number.size(); i++) {
                    if (number.get(i) + currentPeople <= maxCapacity){
                        number.set(i,number.get(i)+currentPeople);
                        break;
                    }
                }
            }
            command = scanner.nextLine();

        }
        for (int element : number) {
            System.out.print(element+" ");

        }
    }
}

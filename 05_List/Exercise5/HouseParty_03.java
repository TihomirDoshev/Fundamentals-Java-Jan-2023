package Foundamentals.Lesson5_List.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String  command  = scanner.nextLine();

            if (command.contains("is going")){

                String  currentName = command.split(" ")[0];

                if (guestList.contains(currentName)){
                    System.out.println(currentName+ " is already in the list!");

                }else {
                    guestList.add(currentName);
                }



            }else if (command.contains("is not going")){

                String  currentName = command.split(" ")[0];

                if (guestList.contains(currentName)) {

                    guestList.remove(currentName);
                }else {
                    System.out.println(currentName + " is not in the list!");
                }


            }

        }
        for (String element : guestList) {
            System.out.println(element+" ");

        }

    }
}

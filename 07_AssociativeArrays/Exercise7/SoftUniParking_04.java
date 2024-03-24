package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Map<String,String> map = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String [] inputArr = scanner.nextLine().split("\\s+");
            String command = inputArr[0];
            String name = inputArr[1];


            if (command.equals("register")){
                String plateNumber = inputArr[2];
                if (!map.containsKey(name)){
                    map.put(name,plateNumber);
                    System.out.printf("%s registered %s successfully%n",name,plateNumber);

                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",map.get(name));
                }


            }else if (command.equals("unregister")){
                if (map.containsKey(name)){
                    System.out.printf("%s unregistered successfully%n",name);
                    map.remove(name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }

            }

        }
        map.entrySet().forEach(e -> System.out.printf("%s => %s%n",e.getKey(),e.getValue()));


    }
}

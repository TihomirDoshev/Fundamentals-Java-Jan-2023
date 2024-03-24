package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.*;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String,Integer> resourceMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String currentRes = command;
            String currentQuantity = scanner.nextLine();

            if (!resourceMap.containsKey(currentRes)){
                resourceMap.put(currentRes,Integer.parseInt(currentQuantity));
            }else {
                resourceMap.put(currentRes,resourceMap.get(currentRes)+Integer.parseInt(currentQuantity));
            }
            command = scanner.nextLine();
        }
        resourceMap.entrySet().forEach(e -> System.out.printf("%s -> %d%n",e.getKey(),e.getValue()));



    }
}

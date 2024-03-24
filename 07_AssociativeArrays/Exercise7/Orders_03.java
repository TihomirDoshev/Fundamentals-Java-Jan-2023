package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Double> priceMap = new LinkedHashMap<>();
        Map<String,Integer> quantityMap = new LinkedHashMap<>();

        String  command = scanner.nextLine();

        while (!command.equals("buy")){
            String product = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            if (!priceMap.containsKey(product)){
                priceMap.put(product,price);

            }else {
                priceMap.put(product,price);

            }
            if (!quantityMap.containsKey(product)){
                quantityMap.put(product,quantity);

            }else {
                quantityMap.put(product,quantityMap.get(product)+quantity);

            }


            command = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> entry : quantityMap.entrySet()) {

            System.out.printf("%s -> %.2f%n",entry.getKey(),quantityMap.get(entry.getKey())*priceMap.get(entry.getKey()));

        }


    }
}

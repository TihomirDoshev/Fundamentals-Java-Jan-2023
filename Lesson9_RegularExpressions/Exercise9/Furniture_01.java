package Foundamentals.Lesson9_RegularExpressions.Exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //>>(?<item>[A-Za-z]+)<<(?<price>[0-9]+[.]*[0-9]*?)!(?<quantity>[0-9]+)

        String  input = scanner.nextLine();
        double totalPrice = 0;
        List<String> itemList = new ArrayList<>();
        while (!input.equals("Purchase")){

            String pattern = ">>(?<item>[A-Za-z]+)<<(?<price>[0-9]+[.]*[0-9]*?)!(?<quantity>[0-9]+)";
            Pattern patternName = Pattern.compile(pattern);
            Matcher matcherName = patternName.matcher(input);

            while (matcherName.find()){
                String item = matcherName.group("item");
                double price = Double.parseDouble(matcherName.group("price"));
                int quantity = Integer.parseInt(matcherName.group("quantity"));
                double itemPrice = quantity*price;
                totalPrice = totalPrice+itemPrice;
                itemList.add(item);
            }



            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String element : itemList) {
            System.out.printf("%s%n",element);

        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}

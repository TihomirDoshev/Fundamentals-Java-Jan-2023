package Foundamentals.Lesson9_RegularExpressions.Exercise9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String pattern = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<item>\\w+)>[^|$%.]*\\|(?<count>[0-9]*)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";

        Pattern namePattern = Pattern.compile(pattern);

        double total = 0;


        while (!input.equals("end of shift")){
            Matcher nameMatcher = namePattern.matcher(input);
            while (nameMatcher.find()){

                String name = nameMatcher.group("name");
                String product = nameMatcher.group("item");
                int count = Integer.parseInt(nameMatcher.group("count"));
                double price =  Double.parseDouble(nameMatcher.group("price"));
                double totalPrice = count * price;
                total = total + totalPrice;

                System.out.printf("%s: %s - %.2f%n",name,product,totalPrice);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",total);
    }
}

package Foundamentals.Lesson5_List.Lection5;

import java.util.*;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String>products = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String  currentProduct = scanner.nextLine();
        products.add(currentProduct);

        }
        Collections.sort(products);
        int number = 1;
        for (String element : products){
            System.out.println(number +"."+element);
            number++;
        }



    }
}

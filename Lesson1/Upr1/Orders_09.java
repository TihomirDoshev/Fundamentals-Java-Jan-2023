package Foundamentals.Lesson1.Upr1;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfOrders = Integer.parseInt(scanner.nextLine());
        //((daysInMonth * capsulesCount) * pricePerCapsule)
        //o	Price per capsule - floating-point number in the range [0.00…1000.00].
        //o	Days – integer in the range [1…31].
        //o	Capsules count - integer in the range [0…2000].
        double allMoney = 0;
        double money = 0;

        for (int i = 1; i <=countOfOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            money = pricePerCapsule * (days*capsuleCount);


            System.out.printf("The price for the coffee is: $%.2f%n",money);

            allMoney =allMoney +money ;
        }

        System.out.printf("Total: $%.2f",allMoney);
    }
}

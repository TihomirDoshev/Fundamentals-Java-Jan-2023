package Foundamentals.Lesson1.Exercise1;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForOneSable = Double.parseDouble(scanner.nextLine());
        double priceForOneRobe = Double.parseDouble(scanner.nextLine());
        double priceForOneBelt = Double.parseDouble(scanner.nextLine());



        double moneyForSables = Math.ceil(countOfStudents + countOfStudents * 0.10)*priceForOneSable;
        double moneyForRobes = priceForOneRobe * countOfStudents;
        double moneyForBelts = (countOfStudents - countOfStudents / 6 )*priceForOneBelt;

        double allMoney = moneyForBelts + moneyForRobes + moneyForSables;


        if (budget>=allMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",allMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",allMoney - budget);
        }

    }
}

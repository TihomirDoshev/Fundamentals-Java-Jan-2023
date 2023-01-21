package Foundamentals.Lesson1.Exercise1;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPerson = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double sum = 0;

        switch (dayOfWeek) {
            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    sum = numOfPerson * 8.45;
                    if (numOfPerson >= 30) {
                        sum = sum - sum * 0.15;
                    }

                } else if (typeOfGroup.equals("Business")) {
                    sum = numOfPerson * 10.90;
                    if (numOfPerson >= 100) {
                        sum = sum - 10 * 10.90;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    sum = numOfPerson * 15;
                    if (numOfPerson >= 10 && numOfPerson <= 20) {
                        sum = sum - sum * 0.05;
                    }

                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    sum = numOfPerson * 9.80;
                    if (numOfPerson >= 30) {
                        sum = sum - sum * 0.15;
                    }

                } else if (typeOfGroup.equals("Business")) {
                    sum = numOfPerson * 15.60;
                    if (numOfPerson >= 100) {
                        sum = sum - 10 * 15.6;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    sum = numOfPerson * 20;
                    if (numOfPerson >= 10 && numOfPerson <= 20) {
                        sum = sum - sum * 0.05;
                    }
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")) {
                    sum = numOfPerson * 10.46;
                    if (numOfPerson >= 30) {
                        sum = sum - sum * 0.15;
                    }

                } else if (typeOfGroup.equals("Business")) {
                    sum = numOfPerson * 16.00;
                    if (numOfPerson >= 100) {
                        sum = sum - 10 * 16;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    sum = numOfPerson * 22.50;
                    if (numOfPerson >= 10 && numOfPerson <= 20) {
                        sum = sum - sum * 0.05;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);

    }
}


package Foundamentals.Lesson2.Exercise2;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int producedYield = 0;
        int dayCount = 0;


        while (startingYield >= 100) {


                dayCount++;
                producedYield = producedYield + startingYield;

                producedYield = producedYield - 26;
                startingYield = startingYield - 10;


            }
        if (producedYield>=26){
            producedYield = producedYield - 26;

        }else {
            producedYield = producedYield;
        }



            System.out.println(dayCount);
            System.out.println(producedYield);


        }

    }


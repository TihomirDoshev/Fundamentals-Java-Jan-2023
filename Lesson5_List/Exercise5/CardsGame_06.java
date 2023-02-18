package Foundamentals.Lesson5_List.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> card1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer> card2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        while (card1.size()>0 && card2.size()>0) {

            if (card1.get(0).equals(card2.get(0))) {
                card1.remove(0);
                card2.remove(0);

            } else if (card1.get(0) > (card2.get(0))) {
                int firstCard1 = card1.get(0);
                int firstCard2 = card2.get(0);
                card1.remove(0);
                card2.remove(0);
                card1.add(Integer.valueOf(firstCard1));
                card1.add(Integer.valueOf(firstCard2));




            } else if (card1.get(0) < (card2.get(0))) {
                int firstCard1 = card1.get(0);
                int firstCard2 = card2.get(0);
                card1.remove(0);
                card2.remove(0);
                card2.add(Integer.valueOf(firstCard2));
                card2.add(Integer.valueOf(firstCard1));


            }


        }
        int total = 0;
        if (card1.size()>card2.size()){
            for (int element :card1) {
                total = total+element;

            }
            System.out.println("First player wins! Sum: "+total);
        }else {
            for (int element : card2) {
                total = total +element;

            }
            System.out.println("Second player wins! Sum: "+total);
        }






    }
}

package Foundamentals.Lesson5_List.Lection5;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer>positiveNumbers = new ArrayList<>();

        for (int element:number) {
            if (element>=0){
                positiveNumbers.add(element);
            }

        }
        if (positiveNumbers.size()<=0){
            System.out.println("empty");
        }else{
            Collections.reverse(positiveNumbers);
        }
        for (int element : positiveNumbers) {
            System.out.print(element+" ");

        }



    }
}

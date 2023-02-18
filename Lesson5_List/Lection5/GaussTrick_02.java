package Foundamentals.Lesson5_List.Lection5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        List<Integer>numbers = new ArrayList<>();

        for (int i = 0; i < num.size()-1; i++) {
            num.set(i,num.get(i)+num.get(num.size()-1));
            num.remove(num.size()-1);


        }
        for (int element :num) {
            System.out.print(element+" ");

        }
    }
}

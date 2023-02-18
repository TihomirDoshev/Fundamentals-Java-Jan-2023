package Foundamentals.Lesson5_List.Lection5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> num2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mixList = new ArrayList<>();
        int shortList = Math.min(num1.size(), num2.size());
        for (int i = 0; i < shortList; i++) {

            mixList.add(num1.get(i));
            mixList.add(num2.get(i));



        }
        if (num1.size()>num2.size()){
            mixList.addAll(num1.subList(shortList,num1.size()));
        }else {
            mixList.addAll(num2.subList(shortList,num2.size()));
        }
        for (int element : mixList) {
            System.out.print(element+" ");

        }



    }
}


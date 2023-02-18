package Foundamentals.Lesson5_List.Lection5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List<Double> num = Arrays.stream(scanner.nextLine().split(" ")).map(Double :: parseDouble).collect(Collectors.toList());

        for (int i = 0; i < num.size()-1; i++) {
            double currentNum = num.get(i);
            double nextNum = num.get(i+1);

            if (currentNum == nextNum){
                num.set(i,currentNum+nextNum);
                num.remove(i+1);
                i =-1;
            }

        }
        DecimalFormat df = new DecimalFormat("0.##");
        for (double element:num) {
            System.out.print(df.format(element)+" ");

        }
    }
}

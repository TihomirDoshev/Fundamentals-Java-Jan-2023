package Foundamentals.Lesson7_AssociativeArrays.Lection7;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer>resultMap=new TreeMap<>();

        for (Double element : numbersArr) {
            if (!resultMap.containsKey(element)){
                resultMap.put(element,1);
            }else {
                resultMap.put(element,resultMap.get(element)+1);
            }

        }
       resultMap.entrySet().forEach(entry -> System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue()));

    }
}

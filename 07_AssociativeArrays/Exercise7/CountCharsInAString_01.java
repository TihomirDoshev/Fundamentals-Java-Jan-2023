package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  text = scanner.nextLine().replaceAll("\\s+","");

        Map<Character,Integer>charMap = new LinkedHashMap();

        for (Character element : text.toCharArray()) {
            if (!charMap.containsKey(element)){
                charMap.put(element,1);

            }else {
                charMap.put(element,charMap.get(element)+1);
            }

        }
        charMap.entrySet().forEach(e -> System.out.printf("%s -> %d%n",e.getKey(),e.getValue()));
    }
}

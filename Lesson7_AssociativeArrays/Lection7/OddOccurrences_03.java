package Foundamentals.Lesson7_AssociativeArrays.Lection7;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String [] inputArr = scanner.nextLine().split("\\s+");
        Map<String,Integer> map = new LinkedHashMap<>();

        for (String element : inputArr) {
            String newWords = element.toLowerCase(Locale.ROOT);

           map.putIfAbsent(newWords,0);
           map.put(newWords,map.get(newWords)+1);

        }
         List<String> names = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 !=0){
                names.add(entry.getKey());

            }
        }
        System.out.println(String.join(", ",names));


    }
}

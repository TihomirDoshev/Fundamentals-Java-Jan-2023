package Foundamentals.Lesson7_AssociativeArrays.Lection7;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String  word = scanner.nextLine();
            String  synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)){
                synonymsMap.put(word,new ArrayList<>(0));
            }
            synonymsMap.get(word).add(synonym);

        }
        synonymsMap.entrySet().forEach(entry -> System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue())));
    }
}

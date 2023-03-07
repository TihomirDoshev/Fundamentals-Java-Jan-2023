package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<Double>> map = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            String  name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)) {
                map.put(name,new ArrayList<>());
                map.get(name).add(grade);

            }else {
                map.get(name).add(grade);

            }

        }
        Map<String,Double> avgMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double average = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average = average +entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            if (average >= 4.50){
                avgMap.put(entry.getKey(),average);
            }
        }
        avgMap.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue()));


    }
}

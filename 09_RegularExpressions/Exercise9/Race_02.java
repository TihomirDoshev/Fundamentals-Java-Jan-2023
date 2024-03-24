package Foundamentals.Lesson9_RegularExpressions.Exercise9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String,Integer> racerMap = new LinkedHashMap<>();

        for (String element : names) {
            racerMap.put(element,0);

        }

         String letters = "[A-Za-z]+";
        Pattern lettersPattern = Pattern.compile(letters);
         String numbers = "[0-9]";
         Pattern numbersPattern = Pattern.compile(numbers);

         String  input = scanner.nextLine();
         while (!input.equals("end of race")){

             StringBuilder racerNames = new StringBuilder();
             Matcher letterMatcher = lettersPattern.matcher(input);
             while (letterMatcher.find()){
                 racerNames.append(letterMatcher.group());
             }

             int distance = 0;
             Matcher numbersMatcher = numbersPattern.matcher(input);
             while (numbersMatcher.find()){
                 distance = distance + Integer.parseInt(numbersMatcher.group());
             }
             if (names.contains(racerNames.toString())){

                 racerMap.put(racerNames.toString(),racerMap.get(racerNames.toString()) + distance);

             }

             input = scanner.nextLine();

         }
         int count = 1;
        for (Map.Entry<String, Integer> entry : racerMap.entrySet()) {
            if (count == 1){
                System.out.printf("1st place: %s%n",entry.getKey());
                count++;
            }else if (count == 2){
                System.out.printf("2nd place: %s%n",entry.getKey());
                count ++ ;

            }else if (count == 3){
                System.out.printf("3rd place: %s%n",entry.getKey());
                break;
            }
        }


    }
}

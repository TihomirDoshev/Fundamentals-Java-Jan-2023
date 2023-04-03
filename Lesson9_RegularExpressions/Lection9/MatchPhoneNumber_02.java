package Foundamentals.Lesson9_RegularExpressions.Lection9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input    = scanner.nextLine();
        List <String> numberList = new ArrayList<>();

        String number = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern numberPattern = Pattern.compile(number);
        Matcher numberMatcher = numberPattern.matcher(input);


        while (numberMatcher.find()){

            numberList.add(numberMatcher.group());
        }
        System.out.println(String.join(", ",numberList));
    }
}

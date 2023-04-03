package Foundamentals.Lesson9_RegularExpressions.Lection9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        String name = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b" ;

        Pattern namePattern = Pattern.compile(name);
        Matcher nameMatcher = namePattern.matcher(input);

        while (nameMatcher.find()){
            System.out.print(nameMatcher.group() + " ");

        }
    }
}

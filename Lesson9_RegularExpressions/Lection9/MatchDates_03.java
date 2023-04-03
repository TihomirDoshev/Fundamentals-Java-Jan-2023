package Foundamentals.Lesson9_RegularExpressions.Lection9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        String data = "(?<day>\\d{2})(?<separator>[\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        Pattern dataP = Pattern.compile(data);
        Matcher dataM = dataP.matcher(input);

        while (dataM.find()){
            String day = dataM.group("day");
            String month = dataM.group("month");
            String year = dataM.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);

        }


    }
}

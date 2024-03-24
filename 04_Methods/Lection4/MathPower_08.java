package Foundamentals.Lesson4_Methods.Lection4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double finalResult = printResult(number,power);

        DecimalFormat df =new DecimalFormat("0.####");

        System.out.println (df.format(finalResult));


    }

    public static double printResult(double n1,double n2){
        return Math.pow(n1,n2);

    }
}

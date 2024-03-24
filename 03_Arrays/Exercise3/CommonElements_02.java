package Foundamentals.Lesson3.Exercise3;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] nameArr1 = scanner.nextLine().split(" ");
        String [] nameArr2 = scanner.nextLine().split(" ");

        for (String elementArr2:nameArr2) {
            for (String elementArr1:nameArr1) {
                if (elementArr2.equals(elementArr1)){
                    System.out.print(elementArr1 +" ");
                    break;
                }

            }
            
        }
    }
}

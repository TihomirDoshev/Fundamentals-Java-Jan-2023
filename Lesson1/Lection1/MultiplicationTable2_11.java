package Foundamentals.Lesson1.Lection1;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = m; i <=10 ; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d\n",n,i,sum);

        }
        if (m>10){
            sum = m*n;
            System.out.printf("%d X %d = %d",n,m,sum);
        }
    }
}

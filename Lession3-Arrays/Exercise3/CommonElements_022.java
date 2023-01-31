package Foundamentals.Lesson3.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Входни данни
        int num = Integer.parseInt(scanner.nextLine());
        int [] numArr1 = new int[num];
        int [] numArr2 = new int[num];
        // 2.Взимане на 2 числа от всеки ред
        for (int i = 0; i < num; i++) {
            int [] currentNumArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int firstNum = currentNumArr[0];
            int secondNum = currentNumArr[1];
            //3. Разпределяне на числата по масивите (четен и нечетен ред)
            if (i % 2 == 0){
                numArr1[i] = firstNum;
                numArr2[i] = secondNum;
            }else {
                numArr1[i] = secondNum;
                numArr2[i] = firstNum;

            }

        }
        //4. Печатаме масивите.
        for (int i = 0; i < numArr1.length; i++) {
            System.out.printf("%d ",numArr1[i]);
        }
        System.out.println();
        for (int i = 0; i < numArr2.length; i++) {
            System.out.printf("%d ",numArr2[i]);

        }



    }
}

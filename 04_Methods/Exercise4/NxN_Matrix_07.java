package Foundamentals.Lesson4_Methods.Exercise4;

import java.util.Scanner;

public class NxN_Matrix_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        printMatrix(num);
    }
    public static void printMatrix(int number){
        for (int i = 0; i <number; i++) {
            for (int j = 0; j <number ; j++) {
                System.out.print(number+" ");
                
            }
            System.out.println();
            
        }
       

        

        }
        
    }


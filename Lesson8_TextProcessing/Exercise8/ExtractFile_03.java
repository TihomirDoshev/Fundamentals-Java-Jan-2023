package Foundamentals.Lesson8_TextProcessing.Exercise8;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\\\");

        String lastWord = inputArr[inputArr.length - 1];

        String fileName =lastWord.split("\\.")[0];
        String fileExtension =lastWord.split("\\.") [1];

        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+fileExtension);





    }
}

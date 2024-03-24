package Foundamentals.Lesson6_ObjectsAndClasses.Exercise6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students_04 {
    static class Students{
        private String firstName;
        private String lastName;
        private double grade;

        public Students(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String [] inputArr = scanner.nextLine().split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            double grade = Double.parseDouble(inputArr[2]);

            Students students = new Students(firstName,lastName,grade);
            studentsList.add(students);





        }
        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students element : studentsList) {
            System.out.printf("%s %s: %.2f%n",element.getFirstName(),element.getLastName(),element.getGrade());

        }

    }
}

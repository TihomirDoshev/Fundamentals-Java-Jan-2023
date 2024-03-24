package Foundamentals.Lesson6_ObjectsAndClasses.Lection6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student{
        private String firstName;
        private String lastName;
        private String age;
        private String town;



        public Student (String firstName, String lastName, String age, String town){

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;

        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentsArr = new ArrayList<>();


        while (!input.equals("end")){
            String [] currentStudent = input.split(" ");
            String firstName = currentStudent[0];
            String lastname = currentStudent[1];
            String age = currentStudent[2];
            String town = currentStudent[3];

            Student Student = new Student(firstName,lastname,age,town);
            studentsArr.add(Student);



            input = scanner.nextLine();


        }
        String homeTown = scanner.nextLine();
        for (Student element : studentsArr){
            if (homeTown.equals(element.getTown())){
                System.out.printf("%s %s is %s years old%n",element.getFirstName(),element.getLastName(),element.getAge());
            }

        }


        }
    }


package Foundamentals.Lesson6_ObjectsAndClasses.Exercise6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge06 {
    static class Person {


        private String name;
        private String id;
        private int age;


        public Person(String name, String id, int age) {

            this.name = name;
            this.id = id;
            this.age = age;
        }


        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        String data = scanner.nextLine();

        while (!data.equals("End")) {

            String name = data.split("\\s+")[0];
            String id = data.split("\\s+")[1];
            int age = Integer.parseInt(data.split("\\s+")[2]);

            Person person = new Person(name, id, age);
            peopleList.add(person);

            data = scanner.nextLine();
        }


        peopleList.sort(Comparator.comparing(Person::getAge));


        for (Person person : peopleList) {

            System.out.println(person.getName() + " with ID: " + person.getId() + " is " + person.getAge() + " years old.");
        }
    }
}

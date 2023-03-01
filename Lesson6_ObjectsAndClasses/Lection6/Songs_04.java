package Foundamentals.Lesson6_ObjectsAndClasses.Lection6;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Songs_04 {
    static class Song {
        private String type;
        private String name;
        private String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;

        }

        public String getType() {
            return this.type;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentInput = scanner.nextLine();
            String[] inputArr = currentInput.split("_");
            String type = inputArr[0];
            String name = inputArr[1];
            String time = inputArr[2];

            Song currentSong = new Song(type, name, time);
            songsArr.add(currentSong);

        }
        String typeList = scanner.nextLine();

        if (typeList.equals("all")) {
            for (Song element : songsArr) {
                System.out.println(element.getName());


            }
        } else {
            for (Song element : songsArr) {
                String currentTypeList = element.getType();
                if (currentTypeList.equals(typeList)){
                    System.out.println(element.getName());

                }

            }


        }
    }
}
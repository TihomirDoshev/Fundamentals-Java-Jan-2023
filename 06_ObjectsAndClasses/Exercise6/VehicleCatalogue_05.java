package Foundamentals.Lesson6_ObjectsAndClasses.Exercise6;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue_05 {
    static class VehicleType {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public VehicleType(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsepower() {
            return this.horsepower;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<VehicleType> allVehicleTypes = new ArrayList<>();

        while (!command.equals("End")) {

            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            VehicleType correctVehicle = new VehicleType(commandList.get(0), commandList.get(1), commandList.get(2), Integer.parseInt(commandList.get(3)));

            allVehicleTypes.add(correctVehicle);

            command = scanner.nextLine();
        }

        String nextCommand = scanner.nextLine();

        while (!nextCommand.equals("Close the Catalogue")) {
            for (int i = 0; i < allVehicleTypes.size(); i++) {
                if (nextCommand.equals(allVehicleTypes.get(i).model)) {
                    if (allVehicleTypes.get(i).type.equals("car")){
                        System.out.println("Type: Car");
                    } else {
                        System.out.println("Type: Truck");
                    }

                    System.out.printf("Model: %s\n", allVehicleTypes.get(i).model);
                    System.out.printf("Color: %s\n", allVehicleTypes.get(i).color);
                    System.out.printf("Horsepower: %d\n", allVehicleTypes.get(i).horsepower);
                }
            }

            nextCommand = scanner.nextLine();
        }

        double averageCarsHP = 0;
        double carsCounter = 0;
        double averageTrucksHP = 0;
        double trucksCounter = 0;

        for (int i = 0; i < allVehicleTypes.size(); i++) {
            if (allVehicleTypes.get(i).type.equals("car")) {
                averageCarsHP = averageCarsHP + allVehicleTypes.get(i).horsepower * 1.0;
                carsCounter++;
            }
            if (allVehicleTypes.get(i).type.equals("truck")) {
                averageTrucksHP = averageTrucksHP + allVehicleTypes.get(i).horsepower * 1.0;
                trucksCounter++;
            }
        }

        double carsAverage = averageCarsHP / carsCounter;
        double trucksAverage = averageTrucksHP / trucksCounter;

        if (carsAverage > 0){
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsAverage);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if (trucksAverage > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksAverage);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }



}




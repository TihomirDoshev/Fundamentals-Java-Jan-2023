package Foundamentals.Lesson7_AssociativeArrays.Exercise7;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("End")) {
            String[] currentCommand = command.split(" -> ");
            String companyName = currentCommand[0];
            String employeeId = currentCommand[1];
            if (!map.containsKey(companyName)) {
                map.put(companyName, new ArrayList<>());
                if (!map.containsValue(employeeId)) {
                    map.get(companyName).add(employeeId);

                }
            } else {
                if (!map.get(companyName).contains(employeeId)) {
                    map.get(companyName).add(employeeId);

                }
                command = scanner.nextLine();
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- "+entry.getValue().get(i));

            }

        }

    }
}

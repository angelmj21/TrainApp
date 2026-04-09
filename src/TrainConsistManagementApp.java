import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    String type;
    int capacity;

    public Bogie(int id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie(1, "Passenger", 70));
        bogies.add(new Bogie(2, "Cargo", 40));
        bogies.add(new Bogie(3, "Passenger", 65));
        bogies.add(new Bogie(4, "Sleeper", 80));
        bogies.add(new Bogie(5, "Cargo", 50));

        // Step 2: Convert list to stream and group by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped bogies
        System.out.println("Grouped Bogies by Type:");

        groupedBogies.forEach((type, bogieList) -> {
            System.out.println("\nType: " + type);
            bogieList.forEach(System.out::println);
        });
    }
}
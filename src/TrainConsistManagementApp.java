import java.util.*;

class Bogie {
    int id;
    String type;
    int capacity;

    public Bogie(int id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
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
        bogies.add(new Bogie(5, "Passenger", 60));

        // Step 2: Stream -> map -> reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display total
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}
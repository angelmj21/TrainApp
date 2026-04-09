import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    int id;
    int capacity;

    public Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie(1, 50));
        bogies.add(new Bogie(2, 70));
        bogies.add(new Bogie(3, 65));
        bogies.add(new Bogie(4, 55));
        bogies.add(new Bogie(5, 80));

        // Step 2: Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());  // collect result

        // Step 3: Display filtered bogies
        System.out.println("Bogies with capacity greater than 60:");
        filteredBogies.forEach(System.out::println);
    }
}
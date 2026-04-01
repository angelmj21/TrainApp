import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie capacities (key-value pairs)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC", 50);
        bogieCapacityMap.put("Cargo", 100);
        bogieCapacityMap.put("Guard", 5);

        // Display capacity details using entrySet()
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Program continues...
    }
}
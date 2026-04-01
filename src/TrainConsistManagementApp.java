import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}
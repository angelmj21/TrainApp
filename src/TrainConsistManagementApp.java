import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    int id;
    String type;
    String cargo;

    public GoodsBogie(int id, String type, String cargo) {
        this.id = id;
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Cargo: " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie(1, "Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie(2, "Box", "Coal"));
        bogies.add(new GoodsBogie(3, "Flat", "Steel"));
        bogies.add(new GoodsBogie(4, "Cylindrical", "Petroleum"));

        // Step 2: Stream + allMatch safety rule
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is Safety Compliant.");
        } else {
            System.out.println("Train Safety Compliance Failed!");
        }
    }
}
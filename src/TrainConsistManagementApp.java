import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    int capacity;

    public Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create bogie collection
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie(i, (int)(Math.random() * 100)));
        }

        // ---------------- LOOP BASED FILTER ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM BASED FILTER ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Step 4: Display results
        System.out.println("Loop Filtering Time: " + loopTime + " ns");
        System.out.println("Stream Filtering Time: " + streamTime + " ns");
    }
}
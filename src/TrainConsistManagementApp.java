import java.util.*;

// Step 1: Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie class
class PassengerBogie {
    int id;
    int capacity;

    public PassengerBogie(int id, int capacity) throws InvalidCapacityException {

        // Step 3: Validate capacity
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0.");
        }

        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Passenger Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            // Step 4: Creating bogies
            PassengerBogie b1 = new PassengerBogie(1, 70);
            PassengerBogie b2 = new PassengerBogie(2, -10); // invalid

            System.out.println(b1);
            System.out.println(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely.");
    }
}
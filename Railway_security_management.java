import java.util.Random;

// Simulated sensor for measuring train speed
class SpeedSensor {
    public int measureTrainSpeed() {
        // Simulate measuring train speed (in km/h)
        return new Random().nextInt(200); // Random speed between 0 and 200 km/h
    }
}

// Simulated sensor for detecting a train crash
class CrashSensor {
    public boolean isCrashDetected() {
        // Simulate crash detection (e.g., based on a random probability)
        return new Random().nextDouble() < 0.05; // 5% chance of crash detection
    }
}

// Communication class for sending messages to the ground office
class GroundOfficeCommunication {
    public void sendMessage(String message) {
        // Simulate sending a message to the ground office
        System.out.println("Sending message to ground office: " + message);
    }
}

public class TrainCrashDetection {
    public static void main(String[] args) {
        SpeedSensor speedSensor = new SpeedSensor();
        CrashSensor crashSensor = new CrashSensor();
        GroundOfficeCommunication communication = new GroundOfficeCommunication();

        // Measure train speed
        int trainSpeed = speedSensor.measureTrainSpeed();

        // Check for a crash
        if (crashSensor.isCrashDetected()) {
            // Simulate additional details
            String crashLocation = "Coordinates: 40.7128° N, 74.0060° W";
            int trainWeight = new Random().nextInt(15000) + 1000; // Random weight between 1000 and 16000 tons
            String crashTime = "2023-09-15 14:30:00";

            String message = "Train has crashed at location: " + crashLocation + "\n" +
                             "Train weight at the time of crash: " + trainWeight + " tons\n" +
                             "Crash time: " + crashTime + "\n" +
                             "Train speed at the time of crash: " + trainSpeed + " km/h.";
            communication.sendMessage(message);
        }
    }
}

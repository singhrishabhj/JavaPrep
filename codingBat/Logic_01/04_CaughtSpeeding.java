// Question:
// You are driving a little too fast, and a police officer stops you.
// Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
// If speed is 60 or less, the result is 0.
// If speed is between 61 and 80 inclusive, the result is 1.
// If speed is 81 or more, the result is 2.
// Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
//
// Examples:
// caughtSpeeding(60, false) → 0
// caughtSpeeding(65, false) → 1
// caughtSpeeding(65, true) → 0

public class CaughtSpeeding {

    // Solution:
    // This method calculates the ticket type based on speed and birthday status.
    // Parameters:
    // speed: Speed of the vehicle.
    // isBirthday: Boolean flag indicating whether it's the driver's birthday.
    //
    // Explanation:
    // 1. If it is your birthday, the speed limits are increased by 5. The line `speed -= 5;` reduces the speed by 5 temporarily, making the comparison easier without changing the actual limit logic.
    // 2. If the speed is 60 or less (or 65 or less on your birthday), return 0 (no ticket).
    // 3. If the speed is between 61 and 80 (or 66 and 85 on your birthday), return 1 (small ticket).
    // 4. If the speed is 81 or more (or 86 or more on your birthday), return 2 (big ticket).
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5; // Increase speed limit by 5 on birthday (temporarily adjust speed for easier comparison)
        }
        if (speed <= 60) {
            return 0; // No ticket
        } else if (speed <= 80) {
            return 1; // Small ticket
        } else {
            return 2; // Big ticket
        }
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false)); // 0
        System.out.println(caughtSpeeding(65, false)); // 1
        System.out.println(caughtSpeeding(65, true));  // 0
    }
}


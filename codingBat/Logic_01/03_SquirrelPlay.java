// Question:
// The squirrels in Palo Alto spend most of the day playing.
// In particular, they play if the temperature is between 60 and 90 (inclusive).
// Unless it is summer, then the upper limit is 100 instead of 90.
// Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
//
// Examples:
// squirrelPlay(70, false) → true
// squirrelPlay(95, false) → false
// squirrelPlay(95, true) → true

public class SquirrelPlay {

    // Solution:
    // This method checks if the squirrels play based on the temperature and season.
    // Parameters:
    // temp: Temperature in degrees.
    // isSummer: Boolean flag indicating whether it is summer.
    //
    // Explanation:
    // 1. If it is summer, squirrels play if the temperature is between 60 and 100 (inclusive).
    // 2. If it is not summer, squirrels play if the temperature is between 60 and 90 (inclusive).
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100; // Summer range
        } else {
            return temp >= 60 && temp <= 90; // Non-summer range
        }
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false)); // true
        System.out.println(squirrelPlay(95, false)); // false
        System.out.println(squirrelPlay(95, true));  // true
    }
}

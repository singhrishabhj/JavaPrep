// Question:
// When squirrels get together for a party, they like to have cigars.
// A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
// Unless it is the weekend, in which case there is no upper bound on the number of cigars.
// Return true if the party with the given values is successful, or false otherwise.
//
// Examples:
// cigarParty(30, false) → false
// cigarParty(50, false) → true
// cigarParty(70, true) → true

public class CigarParty {

    // Solution:
    // This method checks whether the party is successful or not.
    // Parameters:
    // cigars: Number of cigars at the party.
    // isWeekend: Boolean flag indicating whether it's the weekend.
    //
    // Explanation:
    // 1. If it is the weekend, the only condition to make the party successful is that there must be at least 40 cigars.
    //    There is no upper limit on cigars during the weekend.
    // 2. If it is not the weekend, the number of cigars must be between 40 and 60 (inclusive) to make the party successful.
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40; // Weekend condition
        } else {
            return cigars >= 40 && cigars <= 60; // Weekday condition
        }
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // false
        System.out.println(cigarParty(50, false)); // true
        System.out.println(cigarParty(70, true));  // true
    }
}

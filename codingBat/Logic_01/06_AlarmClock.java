// Question:
// Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
// return a string of the form "7:00" indicating when the alarm clock should ring.
// Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
// Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//
// Examples:
// alarmClock(1, false) → "7:00"
// alarmClock(5, false) → "7:00"
// alarmClock(0, false) → "10:00"

public class AlarmClock {

    // Solution:
    // This method determines the alarm clock time based on the day and vacation status.
    // Parameters:
    // day: Integer representing the day of the week (0 = Sun, 1 = Mon, ..., 6 = Sat).
    // vacation: Boolean indicating whether we are on vacation or not.
    //
    // Explanation:
    // 1. If we are on vacation:
    //    - Weekdays (1 to 5): Return "10:00".
    //    - Weekends (0, 6): Return "off".
    // 2. If not on vacation:
    //    - Weekdays (1 to 5): Return "7:00".
    //    - Weekends (0, 6): Return "10:00".
    public static String AlarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00"; // Weekdays on vacation
            } else {
                return "off"; // Weekends on vacation
            }
        }
        if (day >= 1 && day <= 5) {
            return "7:00"; // Weekdays without vacation
        } else {
            return "10:00"; // Weekends without vacation
        }
    }

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));  // "7:00"
        System.out.println(alarmClock(5, false));  // "7:00"
        System.out.println(alarmClock(0, false));  // "10:00"
        System.out.println(alarmClock(0, true));   // "off"
        System.out.println(alarmClock(3, true));   // "10:00"
    }
}

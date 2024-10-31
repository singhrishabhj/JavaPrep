/*
1.11 (Average Speed in Kilometers)
    Assume a runner runs 24 miles in 1 hour, 40 minutes,and 35 seconds. Write a program that displays the average speed in kilometers per hour. 
    (Note that 1 mile is 1.6 kilometers.)
*/
public class Average_speed_in_km {
    public static void main(String[] args) {
        
        // Convert time to hours
        // 1 hour + (40 minutes / 60 to convert to hours) + (35 seconds / 3600 to convert to hours)
        double totalTime = 1 + (40.0 / 60) + (35.0 / 3600);
        
        // Convert distance from miles to kilometers
        // 24 miles * 1.6 (since 1 mile = 1.6 kilometers)
        double milesToKilometers = 24 * 1.6;
        
        // Calculate and display the average speed in km/h
        System.out.println("The average speed in kilometers per hour is: " + (milesToKilometers / totalTime));
    }
}

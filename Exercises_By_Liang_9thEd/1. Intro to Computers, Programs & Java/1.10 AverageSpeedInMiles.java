/*
1.10 (Average speed in miles)
     Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
     (Note that 1 mile is 1.6 kilometres)
*/

public class AverageSpeedInMiles{
  public static void main (String[] args){
        // Distance the runner covers in kilometers
        double distanceKm = 14;
        
        // Convert time to hours
        // 45 minutes to hours: 45 / 60 = 0.75 hours
        // 30 seconds to hours: 30 / 3600 = 0.0083 hours
        double timeHours = 45 / 60.0 + 30 / 3600.0;
        
        // Convert distance from kilometers to miles
        // 1 mile = 1.6 kilometers, so 14 km = 14 / 1.6 miles
        double distanceMiles = distanceKm / 1.6;
        
        // Calculate the average speed in miles per hour
        // average speed = distance (miles) / time (hours)
        double averageSpeedMph = distanceMiles / timeHours;
        
        // Display the result
        System.out.printf("The average speed is %.2f miles per hour.", averageSpeedMph);
  }
}


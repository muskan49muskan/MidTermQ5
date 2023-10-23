
package days;

import java.util.Scanner;

// Define an enum for weekdays
enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (0 for Sunday, 1 for Monday, etc.):");
        int dayNumber = in.nextInt();

        // Validate that the input is within a valid range (0-6)
        if (dayNumber >= 0 && dayNumber <= 6) {
            Weekday[] weekdays = Weekday.values();
            Weekday selectedDay = weekdays[dayNumber];
            System.out.println("The day is: " + selectedDay);
        } else {
            System.out.println("Invalid day number. Please enter a number between 0 and 6.");
        }
    }
}
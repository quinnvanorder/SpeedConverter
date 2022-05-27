// First exercise, this one has a video walk-through, the remainder don't.

// Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
// This method needs to return the rounded value of the calculation type long.
// If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an
// invalid value
// Otherwise if it is positive, calculate the value of miles per hour, round it and return it. For conversion and
// rounding, check the notes in the text below.

// Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
// This method should not return anything (void) and it needs to calculate milesPerHour from the KilometersPerHour
// parameter.
// Then it needs to print a message in the format "XX km/h = yy mi/h".
// XX represents the original value kilometersPerHour.
// YY represents the rounded milesPerHour from the kilometersPerHour parameter.
// If the parameter kilometersPerHour is <0 then print the text "Invalid Value".

// Use the Math.round to round the number of calculated miles per hour (double). The method round returns long.
// The Math.round() is a built-in math method which returns the closest long to the argument. The result is rounded
// to an integer by adding 1/2, taking the floor of the result after adding 1/2, and typecasting the result to type
// long. The method returns the value of the argument rounded to the nearest int value.

// TIP: In the method PrintConversion, call the method toMilesPerHour instead of duplicating the code.
// NOTE: All methods should be defined as public static like we have been doing so far in the course.
// NOTE: 1 mile per hour is 1.609 kilometers per hour.
// NOTE: Do not add a main method to the solution code, this will break the web tool for checking solution validity.

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

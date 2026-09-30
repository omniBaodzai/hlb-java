package ex02;

public class SpeedConverter
{
    public static void main(String[] args)
    {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.144));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.144);
    }

    /*
    1 mi/h = 1.609344 km/h
    1 km/h = 0.621371 mi/h
    */

    // Hàm toMilesPerHour: Cho kilometer và chuyển nó sang mile
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            return - 1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    // Hàm printConversion: In kết quả
    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h"); // OK: 25.42 km/h = 16 mi/h
        System.out.printf("%s km/h = %d mi/h%n", kilometersPerHour, milesPerHour); // OK: 25.42 km/h = 16 mi/h
        System.out.printf("%f km/h = %d mi/h%n", kilometersPerHour, milesPerHour); // 25.420000 km/h = 16 mi/h
        System.out.printf("%.2f km/h = %d mi/h%n", kilometersPerHour, milesPerHour); // 25.42 km/h = 16 mi/h
    }
}

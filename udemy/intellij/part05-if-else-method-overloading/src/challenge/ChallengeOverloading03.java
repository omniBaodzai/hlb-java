package challenge;

public class ChallengeOverloading03
{
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args) {

        // Sample input
        int secondsInput = 3999;
        int minutesInput = 61;
        int secondsRemainder = 5;

        // Test method 1
        String result1 = getDurationString(secondsInput);
        if (!result1.equals("Invalid value"))
        {
            System.out.println(secondsInput + " seconds = " + result1);
        }

        // Test method 2
        String result2 = getDurationString(minutesInput, secondsRemainder);
        if (!result2.equals("Invalid value")) {
            System.out.println(minutesInput + "m " + secondsRemainder + "s = " + result2);
        }
    }

    // Method 1: Nhận tổng seconds
    public static String getDurationString(int seconds)
    {
        if (seconds < 0)
        {
            System.out.println("Invalid input: seconds must be >= 0");
            return "Invalid value";
        }

        int minutes = seconds / SECONDS_PER_MINUTE;
        int remainingSeconds = seconds % SECONDS_PER_MINUTE;

        return getDurationString(minutes, remainingSeconds);
    }

    // Method 2: nhận minutes + seconds
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= SECONDS_PER_MINUTE) {
            System.out.println("Invalid input: minutes >= 0, 0 <= seconds < 60");
            return "Invalid value";
        }

        int hours = minutes / MINUTES_PER_HOUR;
        int remainingMinutes = minutes % MINUTES_PER_HOUR;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}

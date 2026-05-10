package challenge;

public class ChallengeOverloading03
{
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args)
    {

        // Sample input
        int secondsInput = 3999;
        int minutesInput = 61;
        int secondsRemainder = -5;

//        // Test method 1
//        String result1 = getDurationString(secondsInput);
//        if (!result1.equals("Invalid value"))
//        {
//            System.out.println(secondsInput + " seconds = " + result1);
//        }
//
//        // Test method 2
//        String result2 = getDurationString(minutesInput, secondsRemainder);
//        if (!result2.equals("Invalid value")) {
//            System.out.println(minutesInput + "m " + secondsRemainder + "s = " + result2);
//        }

        System.out.println(getDurationString(secondsInput));
        System.out.println(getDurationString(minutesInput, secondsRemainder));
    }

    // Method 1: Nhận tổng seconds
    public static String getDurationString(int seconds)
    {
        if (seconds < 0)
        {
            return "Invalid input: seconds must be >= 0";
        }

        // Đổi giây sang phút và giây còn lại
        int minutes = seconds / SECONDS_PER_MINUTE;
        int remainingSeconds = seconds % SECONDS_PER_MINUTE;

        // Gọi phương thức thứ hai
        return getDurationString(minutes, remainingSeconds);
    }

    // Method 2: nhận minutes + seconds
    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes < 0 || seconds < 0 || seconds > 59)
        {
            return "Invalid input: minutes >= 0, 0 <= seconds <= 59";
        }

        // Đổi phút sang giờ
        int hours = minutes / MINUTES_PER_HOUR;

        // Phút còn lại
        int remainingMinutes = minutes % MINUTES_PER_HOUR;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}

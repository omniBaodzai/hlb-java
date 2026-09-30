public class DoSomething
{
    public static void main(String[] args)
    {

    }

    // Method 1
    public static String getDurationString(int seconds)
    {
        if (seconds < 0)
        {
            return "Seconds must be >= 0";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    // Method 2
    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes < 0 || seconds < 0 || seconds > 59)
        {
            return "Minutes must be >= 0, and seconds must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return " h " + " m " + " s";
    }

}

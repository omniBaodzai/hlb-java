package challenge;

public class ChallengeOverloading04
{
    public static void main(String[] args)
    {
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(-1, 0));

    }

    public static String getDurationString(int seconds)
    {
        if (seconds < 0)
        {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes < 0 || seconds < 0 || seconds > 59)
        {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String checkNumber(int n)
    {
        if (n > 0)
        {
            return "Positive";
        }
        else if (n < 0)
        {
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }

    public static String test(int n) {
        if (n > 0) {
            return "Positive";
        }

        if (n < 0) {
            return "Negative";
        }

        return "Zero";
    }
}

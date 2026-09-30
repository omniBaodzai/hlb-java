package switch_statement;

public class DayOfTheWeek
{
    public static void main(String[] args)
    {
        int day = 3;

        String dayName = switch (day)
        {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Value";
        };

        System.out.println(dayName);
    }
}

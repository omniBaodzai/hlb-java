package challenge;

public class ChallengeSwitchEnhance02
{
    public static void main(String[] args)
    {
        printDayOfWeek(4);
        printDayOfWeek(9);

        printWeekDay(3);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day)
    {
        String dayOfWeek = switch (day)
        {

            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day)
    {
        String dayOfWeek = "Invalid Day";

        if (day == 0)
            dayOfWeek = "Sunday";
        else if (day == 1)
            dayOfWeek = "Monday";
        else if (day == 2)
            dayOfWeek = "Tuesday";
        else if (day == 3)
            dayOfWeek = "Wednesday";
        else if (day == 4)
            dayOfWeek = "Thursday";
        else if (day == 5)
            dayOfWeek = "Friday";
        else if (day == 6)
            dayOfWeek = "Saturday";

        System.out.println(day + " stands for " + dayOfWeek);
    }
}

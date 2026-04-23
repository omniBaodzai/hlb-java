package switch_statement;

public class ChallengeSwitchEnhance01
{
    public static void main(String[] args)
    {
        printDayOfWeek(6);
        printDayOfWeek(9);
    }

    public static void printDayOfWeek(int day)
    {
        switch (day)
        {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }
    }
}

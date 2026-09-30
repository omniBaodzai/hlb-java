package switch_statement;

public class DayOfTheMonth
{
    public static void main(String[] args)
    {
        int month = 2;
        int year = 2028;

        int days = switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                yield leapYear ? 29 : 28;
            }
            default -> 0;
        };

        System.out.println(days);
    }
}

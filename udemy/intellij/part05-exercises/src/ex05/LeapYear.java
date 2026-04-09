package ex05;

public class LeapYear
{
    public static void main(String[] args)
    {
        boolean result = isLeapYear(2000);
        System.out.println(result);
    }
    public static boolean isLeapYear(int year)
    {
        if (year < 1 || year > 9999)
        {
            return false;
        }

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}

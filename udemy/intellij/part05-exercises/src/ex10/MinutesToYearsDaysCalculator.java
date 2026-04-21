package ex10;

public class MinutesToYearsDaysCalculator
{
    public static void main(String[] args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    /*
    - 1 năm = 365 ngày = 525600 phút
    - 1 ngày = 24 giờ = 1440 phút
    - 1 giờ = 60 phút = 3600 giây
     */

    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            long years = minutes / 525600;
            long days = minutes % 525600 / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

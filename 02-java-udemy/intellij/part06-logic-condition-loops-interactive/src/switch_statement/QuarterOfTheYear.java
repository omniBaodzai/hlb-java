package switch_statement;

public class QuarterOfTheYear
{
    public static void main(String[] args)
    {
        int month = 2;

        String quarter = switch (month)
        {
            case 1, 2, 3 -> "The first quarter";
            case 4, 5, 6 -> "The second quarter";
            case 7, 8, 9 -> "The third quarter";
            case 10, 11, 12 -> "The fourth quarter";
            default -> "Invalid Value";
        };

        System.out.println(quarter);
    }
}

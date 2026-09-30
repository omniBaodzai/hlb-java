package switch_statement;

public class SumOfTwoNumbers
{
    public static void main(String[] args)
    {
        int value = 2;

        String result = switch (value)
        {
            case 1 -> "A";
            case 2 -> {
                int x = 10;
                int y = 2;
                yield "Tổng của " + x + " + " + y + " = " + (x + y);
            }
            default -> "Không xác định";
        };

        System.out.println(result);
    }
}

package ex15;

public class SumOddRange
{
    public static void main(String[] args)
    {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    // Hàm isOdd: Kiểm tra số lẻ
    public static boolean isOdd(int number)
    {
        return (number > 0 && number % 2 != 0);
    }

    // Hàm sumOdd: Tổng số lẻ
    public static int sumOdd(int start, int end)
    {
        if (start <= 0 || end <= 0 || end < start)
        {
            return - 1;
        }

        int sum = 0;

        for (int number = start; number <= end; number++)
        {
            if(isOdd(number))
            {
                sum += number;
            }
        }

        return sum;
    }
}

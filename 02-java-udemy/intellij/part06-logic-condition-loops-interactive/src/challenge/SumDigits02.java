package challenge;

public class SumDigits02
{
    public static void main(String[] args)
    {
        System.out.println(sumDigits(125));   // 8
        System.out.println(sumDigits(1000));  // 1
        System.out.println(sumDigits(9));     // 9
        System.out.println(sumDigits(-5));    // -1
    }

    // Hàm sumDigits: Tính tổng các chữ số của một số
    public static int sumDigits(int number)
    {
        if (number < 0)
            return -1;

        int sum = 0;

        while (number > 0)
        {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

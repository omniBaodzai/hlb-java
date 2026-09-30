package ex01;

public class PositiveNegativeZero
{
    public static void main(String[] arg)
    {
        checkNumber(2);
        checkNumber(-1);
        checkNumber(-0);
    }

    // Hàm checkNumber: Kiểm tra số dương, âm, 0
    public static void checkNumber(int number)
    {
        if (number > 0)
        {
            System.out.println("positive");
        }
        else if (number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}

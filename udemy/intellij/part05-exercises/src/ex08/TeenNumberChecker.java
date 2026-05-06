package ex08;

public class TeenNumberChecker
{
    public static void main(String[] args)
    {
        boolean result1 = hasTeen(9, 99, 19);
        boolean result2 = isTeen(9);

        System.out.println(result1);
        System.out.println(result2);
    }

    // Hàm hasTeen: Kiểm tra xem tuổi có phải là teen không
    public static boolean hasTeen(int a, int b, int c)
    {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    // Hàm isTeen: Kiểm tra xem tuổi có phải là teen không
    public static boolean isTeen(int number)
    {
        return number > 12 && number < 20;
    }
}

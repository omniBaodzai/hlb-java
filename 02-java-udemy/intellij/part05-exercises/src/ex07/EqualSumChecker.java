package ex07;

public class EqualSumChecker
{
    public static void main(String[] args)
    {
        boolean result = hasEqualSum(1, 1, 1);
        System.out.println(result);

        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    // Hàm hasEqualSum: Kiểm tra xem tổng có bằng nhau không
    public static boolean hasEqualSum(int a, int b, int c)
    {
        return (a + b) == c;
    }
}

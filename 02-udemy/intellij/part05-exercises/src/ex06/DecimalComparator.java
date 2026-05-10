package ex06;

public class DecimalComparator
{
    public static void main(String[] args)
    {
        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    // Hàm areEqualByThreeDecimalPlaces: Kiểm tra xem phần thập phân bằng nhau không
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue)
    {
        int firstValueInt = (int)(firstValue * 1000);
        int secondValueInt = (int)(secondValue * 1000);

        return firstValueInt == secondValueInt;
    }
}

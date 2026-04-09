package ex07;

public class EqualSumChecker
{
    public static void main(String[] args)
    {
        boolean result = hasEqualSum(1, -1, 0);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue)
    {
        int totalValue = firstValue + secondValue;
        return totalValue == thirdValue;
    }
}

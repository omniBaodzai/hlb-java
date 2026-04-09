package ex06;

public class DecimalComparator
{
    public static void main(String[] args)
    {
        boolean result = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue)
    {
        int firstValueInt = (int)(firstValue * 1000);
        int secondValueInt = (int)(secondValue * 1000);

        return firstValueInt == secondValueInt;
    }
}

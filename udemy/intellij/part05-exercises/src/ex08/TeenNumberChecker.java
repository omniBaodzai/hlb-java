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

    public static boolean hasTeen(int firstTeen, int secondTeen, int thirdTeen)
    {
        if (firstTeen >= 13 && firstTeen <= 19) // 9: không thỏa
        {
            return true;
        }
        else if (secondTeen >= 13 && secondTeen <= 19) // 99: không thỏa
        {
            return true;
        }
        else if (thirdTeen >= 13 && thirdTeen <= 19) // 19: thỏa
        {
            return true; // true
        }
        else
        {
            return false;
        }
    }

    public static boolean isTeen(int teenValue)
    {
        return teenValue >= 13 && teenValue <= 19;
    }
}

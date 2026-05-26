package challenge;

public class ChallengeForLoop02
{
    public static void main(String[] args)
    {
        // ALT + J
        int count = 0;

        for (int number = 10; count < 3 && number <= 50; number++)
        {
            if (isPrime(number))
            {
                System.out.println(number);
                count++;
            }

//            if (count == 3)
//            {
//                break;
//            }
        }
    }

    // Hàm isPrime: Kiểm tra số nguyên tố
    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }

        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}

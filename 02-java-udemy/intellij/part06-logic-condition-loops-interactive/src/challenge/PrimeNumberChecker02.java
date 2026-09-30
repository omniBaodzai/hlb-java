package challenge;

public class PrimeNumberChecker02
{
    public static void main(String[] args)
    {

        int primeCount = 0;

        for (int i = 1; i <= 1000; i++)
        {

            if (isPrime(i))
            {
                System.out.println(i);
                primeCount++;
            }

            if (primeCount == 3)
                break;
        }
    }

    // Hàm isPrime: Kiểm tra số nguyên tố
    public static boolean isPrime(int number)
    {

        if (number < 2)
            return false;

        for (int i = 2; i <= number / 2; i++)
        {

            if (number % i == 0)
                return false;
        }

        return true;
    }
}

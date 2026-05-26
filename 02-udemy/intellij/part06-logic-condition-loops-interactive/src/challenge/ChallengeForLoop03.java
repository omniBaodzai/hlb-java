package challenge;

public class ChallengeForLoop03
{
    public static void main(String[] args)
    {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);

                sum += i;
                count++;
            }

            if (count == 5) break;
        }

        System.out.println("The sum of all numbers divisible by both 3 and 5 is: " + sum);
    }
}

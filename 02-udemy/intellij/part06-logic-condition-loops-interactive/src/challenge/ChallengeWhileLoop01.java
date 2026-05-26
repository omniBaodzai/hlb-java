package challenge;

public class ChallengeWhileLoop01
{
    public static void main(String[] args)
    {
        int i = 5;
        int evenCount = 0;
        int oddCount = 0;

        while (i <= 20)
        {
            if (isEvenNumber(i))
            {
                evenCount++;
                System.out.println(i + " ");
                if (evenCount == 5) break;
            }
            else
            {
                oddCount++;
            }
            i++;
        }

        System.out.println("Total even numbers foud = " + evenCount);
        System.out.println("Total odd numbers foud = " + oddCount);
    }

    // Hàm isEvenNumber: Kiểm tra số chẵn
    public static boolean isEvenNumber(int a)
    {
        return (a % 2 == 0);
    }
}

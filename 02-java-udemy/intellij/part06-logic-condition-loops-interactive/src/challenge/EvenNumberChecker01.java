package challenge;

public class EvenNumberChecker01
{
    public static void main(String[] args)
    {
        int number = 5;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20)
        {

            if (isEvenNumber(number))
            {
                System.out.println(number);
                evenCount++;
            }
            else
            {
                oddCount++;
            }

            if (evenCount == 5) break;

            number++;
        }

        System.out.println("Total even numbers = " + evenCount);
        System.out.println("Total odd numbers = " + oddCount);
    }

    // Hàm isEvenNumber: Kiểm tra số chẵn
    public static boolean isEvenNumber(int a)
    {
        return (a % 2 == 0);
    }
}

package challenge;

public class ChallengeWhileLoop02
{
    public static void main(String[] args)
    {
        int i = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (i <= 20)
        {
            i++;
            if (!isEvenNumber(i)) // !false (i = 5)
            {
                oddCount++;
               continue; // bỏ qua các câu lệnh bên dưới, tăng i lên 6
            }
            System.out.println(i + " ");
            evenCount++;
            if (evenCount == 5) break;
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

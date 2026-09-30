package challenge;

public class EvenNumberChecker02
{
    public static void main(String[] args)
    {
        int number = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20)
        {
            number++;

            if (!isEvenNumber(number)) // !false (i = 5)
            {
                oddCount++;
                continue; // bỏ qua các câu lệnh bên dưới, tăng i lên 6
            }

            System.out.println(number + " ");
            evenCount++;

            if (evenCount == 5) break;
        }

        System.out.println("Total even numbers foud = " + evenCount);
        System.out.println("Total odd numbers foud = " + oddCount);
    }

    // Hàm isEvenNumber: Kiểm tra số chẵn
    public static boolean isEvenNumber(int number)
    {
        return (number % 2 == 0);
    }
}

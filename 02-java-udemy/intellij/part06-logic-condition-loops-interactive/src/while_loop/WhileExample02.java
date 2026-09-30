package while_loop;

public class WhileExample02
{
    public static void main(String[] args)
    {
        int number = 0;
        while (number < 50)
        {
            number += 5;
            if (number % 25 == 0) continue; // Bỏ qua 25 và 50
            System.out.print(number + "_"); // 5_10_15_20_30_35_40_45_
        }

    }
}

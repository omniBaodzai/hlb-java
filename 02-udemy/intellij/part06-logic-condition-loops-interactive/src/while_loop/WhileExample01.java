package while_loop;

public class WhileExample01
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

//        int j = 1;
//        while (true)
//        {
//            if (j > 5) break;
//            System.out.println(j);
//            j++;
//        }

        int j = 1;
        boolean isReady = false;
        while (isReady)
        {
            if (j > 5) break;
            System.out.println(j); // Khối lệnh bên trong while không thực thi
            j++;
        }

        do
        {
            if (j > 5) break;
            System.out.println(j); // 1
            j++;
        }
        while (isReady);
    }
}

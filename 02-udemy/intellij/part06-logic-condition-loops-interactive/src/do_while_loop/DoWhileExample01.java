package do_while_loop;

public class DoWhileExample01
{
    public static void main(String[] args) {
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
            System.out.println(j + " haha"); // 1, luôn thực thi ít nhất 1 lần, dù điều kiện sai
            j++;
        }
        while (isReady);

        do
        {
            if (j > 5) break;
            System.out.println(j);
            j++;
            isReady = (j > 0);
        }
        while (isReady);
    }
}

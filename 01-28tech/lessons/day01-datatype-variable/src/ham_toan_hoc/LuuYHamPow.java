package ham_toan_hoc;

import java.util.Scanner;

public class LuuYHamPow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((long)Math.pow(a, b));
    }
}

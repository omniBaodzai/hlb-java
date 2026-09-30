package ex16;

public class NumberPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11221));
    }

    // Hàm isPalindrome: Kiểm tra số đối xứng
    public static boolean isPalindrome(int number)
    {
        int reversedNumber = 0;


        if (number < 0)
        {
            number = -number;
        }

        int temp = number;

        while (number > 0)
        {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return reversedNumber == temp;
    }
}

public class Note01
{
    public static void main(String[] args)
    {
        long myLongValue1 = 100; //  100 ở đây là một kiểu int được gán cho biến thuộc kiểu long
        long myLongValue2 = 100L; // Thêm hậu tố 'L' thì 100 là kiểu long
        
        System.out.println(myLongValue1 + " có kiểu int do không có hậu tố L");
        System.out.println(myLongValue2+ " có kiểu long do có hậu tố L");
    }
}

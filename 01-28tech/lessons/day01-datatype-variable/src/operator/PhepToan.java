package operator;

public class PhepToan
{
    public static void main(String[] args)
    {
        /*
        - Nếu biểu thức tính toán toàn số nguyên
        => kết quả luôn là số nguyên
         */
        int a = 10, b = 3;
        System.out.println(a / b); // int / int = int = 3

        /*
        - Nếu biểu thức tính toán tồn tại ít nhất 1 số thực
        => kết quả luôn là số thực
         */
        int c = 10;
        double d = 3;
        System.out.println(c / d); // int / double = double = 3.3333333333333335

        int a1 = 10, a2 = 3;
        double thuong1 = a / b; // vế trái vẫn là số nguyên (int)
        System.out.println(thuong1); // 3.0 (gán cho một biến số thực nên có phần thập phân)

        int a3 = 10, a4 = 3;
        double thuong2 = (double)a / b; // Tạm thời ép biến a thành số thực: 10.0000
        System.out.println(thuong2); // double / int = double = 3.3333333333333335
        // Hoặc thuong2 = 1.0 * a / b

        int a5 = 500000, a6 = 1000000;
        long res1 = 1L * a5 * a6;
        System.out.println(res1);
    }
}

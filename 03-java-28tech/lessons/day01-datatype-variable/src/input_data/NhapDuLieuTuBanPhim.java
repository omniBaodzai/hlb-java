package input_data;

// Import thư viện util để sử dụng Scanner

import java.util.Scanner;

public class NhapDuLieuTuBanPhim
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu có kiểu int
        int a = sc.nextInt();

        // Nhập dữ liệu có kiểu long
        long b = sc.nextLong();

        // Nhập dữ liệu có kiểu char
        char kyTu = sc.next().charAt(0);

        System.out.println(a + " " + b + " " + kyTu);
    }
}

package switch_statement;

import java.util.Scanner;

public class MenuChoice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu ===");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Xem sản phẩm");
        System.out.println("0. Thoát");

        System.out.print("Lựa chọn: ");
        int choice = sc.nextInt();

        String result = switch (choice)
        {
            case 1 -> "Bạn đã chọn: Thêm sản phẩm";
            case 2 -> "Bạn đã chọn: Xóa sản phẩm";
            case 3 -> "Bạn đã chọn: Xem sản phẩm";
            case 0 -> "Thoát chương trình";
            default -> "Lựa chọn không hợp lệ";
        };

        System.out.println(result);
    }
}
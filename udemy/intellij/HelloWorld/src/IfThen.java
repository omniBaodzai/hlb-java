public class IfThen {
    public static void main(String[] args) {
//        boolean isAlien = false;
//        if (isAlien == false) // Đúng
//            System.out.println("It is not an Alien"); // Được in ra

//        if (isAlien == false); // = if (isAlien == false) {...};
//            System.out.println("It is not an Alien"); // Vẫn in ra

//        if (isAlien == true); // rỗng
//            System.out.println("It is not an Alien"); // Vẫn in ra

//        if (isAlien == true) // sai, câu lệnh bên trong không được thực hiện
//            System.out.println("It is not an Alien"); // Không in ra

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("Dòng này không được in ra");
            System.out.println("Nhưng dòng này được in ra");
            /* Lý do: Câu lệnh bên trong if từ 2 trở lên phải được
            đặt trong cặp dấu ngoặc nhọn. Do đó câu lệnh 19 nó là một
            câu lệnh riêng, không nằm trong if, nên nó vẫn in ra như thường */

        // Điều kiện sai nên câu lệnh 26 và 27 bên trong không được thực thi
        if (isAlien == false) {
            System.out.println("Dòng này không được in ra");
            System.out.println("Dòng này không được in ra");
        }
    }
}

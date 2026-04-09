public class IfLogical {
    public static void main(String[] args) {
        int newValue = 50;
//        if (newValue = 50) {
//            System.out.println("This is error");
//        }

        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) { // isCar = true != isCar == true
            System.out.println("Câu lệnh này được thực thi");
        }

        // Best practice
        if (isCar) {
            System.out.println("Không chạy");
        }

        if (!isCar) {
            System.out.println("Chạy");
        }
    }
}

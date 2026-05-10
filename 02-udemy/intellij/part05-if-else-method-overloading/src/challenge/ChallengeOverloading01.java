package challenge;

public class ChallengeOverloading01
{
    private static final double INCH_TO_CM = 2.54;
    private static final int FOOT_TO_INCH = 12;

    public static void main(String[] args)
    {
        // Gọi hàm convertToCentimeters thứ nhất
        int heightInches = -1;
        double heightCm1 = convertToCentimeters(heightInches);

        // Chỉ in kết quả nếu là hợp lệ
        if (heightCm1 != -1)
        {
            System.out.println(heightInches + " inches = " + heightCm1 + " cm");
        }

        // Gọi hàm convertToCentimeters thứ hai
        int feet = 5;
        int inches = 8;
        double heightCm2 = convertToCentimeters(feet, inches);

        // Chỉ in kết quả nếu là hợp lệ
        if (heightCm2 != -1)
        {
            System.out.println(feet + " feet " + inches + " inches = " +
                    heightCm2 + " cm");
        }

//        System.out.println(convertToCentimeters(-1)); // In ra câu lệnh 48
    }

    // Hàm convertToCentimeters đầu tiên: Đổi inches sang centimeters
    public static double convertToCentimeters(int inches)
    {
        // Kiểm tra giá trị âm
        if (inches < 0)
        {
            System.out.println("Invalid input: inches must be >= 0");
            return -1;
        }

        // Đổi từ inches sang centimeters
        return inches * INCH_TO_CM;
    }

    // Hàm convertToCentimeters thứ hai: Đổi feet + inches sang centimeters
    public static double convertToCentimeters(int feet, int inches)
    {
        // Kiểm tra giá trị âm
        if (feet < 0 || inches < 0 || inches >= FOOT_TO_INCH)
        {
            System.out.println("Invalid input: feet >= 0, 0 <= inches < 12");
            return -1;
        }

        // Đổi từ feet sang inches trước
        // Sau đó cộng lại với inches
        int totalInches = (feet * FOOT_TO_INCH) + inches;

        return convertToCentimeters(totalInches); // Tái sử dụng method 1
    }
}

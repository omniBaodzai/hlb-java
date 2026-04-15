package challenge;

public class ChallengeOverloading01
{
    private static final double INCH_TO_CM = 2.54;
    private static final int FOOT_TO_INCH = 12;

    public static void main(String[] args)
    {
        // Input test
        int inchesInput = -1;
        int feetInput = 5;
        int inchesRemainder = 8;

        double result1 = convertToCentimeters(inchesInput);
        if (result1 != -1)
        {
            System.out.println(inchesInput + " inches = " + result1 + " cm");
        }

        double result2 = convertToCentimeters(feetInput, inchesRemainder);
        if (result2 != -1)
        {
            System.out.println(feetInput + " feet " + inchesRemainder + " inches = " +
                    result2 + " cm");
        }
    }

    // Method 1: Nhận inches
    public static double convertToCentimeters(int inches)
    {
        if (inches < 0)
        {
            System.out.println("Invalid input: inches must be >= 0");
            return -1;
        }

        // Đổi từ inches sang centimeters
        return inches * INCH_TO_CM;
    }

    // Method 2: Nhận feet và inches
    public static double convertToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches >= FOOT_TO_INCH) {
            System.out.println("Invalid input: feet >= 0, 0 <= inches < 12");
            return -1;
        }

        // Đổi từ feet sang inches trước
        // Sau đó cộng lại với inches
        int totalInches = (feet * FOOT_TO_INCH) + inches;

        return convertToCentimeters(totalInches); // Tái sử dụng method 1
    }
}

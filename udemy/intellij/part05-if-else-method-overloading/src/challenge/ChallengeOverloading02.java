package challenge;

public class ChallengeOverloading02
{
    public static void main(String[] args)
    {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    // Method 1: Nhận inches
    public static double convertToCentimeters(int inches)
    {
        // Đổi từ in sang cm
        return inches * 2.54;
    }

    // Method 2: Nạp chồng, nhận feet và inches
    public static double convertToCentimeters(int feet, int inches)
    {
        // Đổi từ ft sang in
        int feetToInches = feet * 12;

        // Cộng với inches
        int totalInches = feetToInches + inches;

        // Đổi tổng totalInches sang cm
        return convertToCentimeters(totalInches);
    }
}

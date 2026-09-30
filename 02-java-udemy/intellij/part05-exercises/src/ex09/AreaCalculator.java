package ex09;

public class AreaCalculator
{
    private static final int INVALID_VALUE = -1;

    public static void main(String[] args)
    {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    // Hàm area thứ nhất: Tính diện tích hình tròn
    public static double area(double radius)
    {
        if (radius < 0)
        {
            return INVALID_VALUE;
        }

        return Math.PI * radius * radius;
    }

    // Hàm area thứ hai: Tính diện tích hình chữ nhật
    public static double area(double x, double y)
    {
        if (x < 0 || y < 0)
        {
            return INVALID_VALUE;
        }

        return x * y;
    }
}

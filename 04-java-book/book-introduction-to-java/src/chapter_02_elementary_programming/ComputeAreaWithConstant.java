package chapter_02_elementary_programming;

public class ComputeAreaWithConstant 
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        input.close();
    }
}

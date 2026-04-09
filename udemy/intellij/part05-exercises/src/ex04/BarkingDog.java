package ex04;

public class BarkingDog
{
    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay < 8 || hourOfDay > 22)
        {
            return true;
        }

    }
}

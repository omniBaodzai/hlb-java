public class ChallengeNumeric
{
    public static void main(String[] args)
    {
        byte myByteValue = 20;
        short myShortValue = 15;
        int myIntValue = 5;

        long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        
        System.out.print("Total is: " + longTotal);
    }
}
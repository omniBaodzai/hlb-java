package ex12;

public class PlayingCat
{
    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
//        int max = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= max;

        if (summer)
        {
            return temperature >= 25 && temperature <= 45;
        }

        return temperature >= 25 && temperature <= 35;
    }
}

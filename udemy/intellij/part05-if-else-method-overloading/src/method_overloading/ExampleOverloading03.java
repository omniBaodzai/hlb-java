package method_overloading;

public class ExampleOverloading03
{
    public static void main(String[] args)
    {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Phướng thức nạp chồng
    public static int calculateScore(int score)
    {
        return calculateScore("Anonymous", score);
    }

    // Phương thức nạp chồng
    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }
}

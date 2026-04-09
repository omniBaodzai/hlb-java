package method_overloading;

public class ExampleOverloading02
{
    public static void main(String[] args)
    {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        // Gọi phương thức nạp chồng
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Phướng thức nạp chồng
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // Phương thức nạp chồng
    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

    // Chữ ký không hợp lệ, do signature không bao gồm return type
//    public static void calculateScore()
//    {
//        System.out.println("Error compile");
//    }
}

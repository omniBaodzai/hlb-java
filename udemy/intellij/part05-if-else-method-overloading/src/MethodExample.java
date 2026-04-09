public class MethodExample
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        // Gọi/thực thi phương thức
        calculateScore(true, 800, levelCompleted, bonus);

        // New value
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);
            System.out.println("2. Your final score was " + finalScore);
        }
    }
    // method
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        int finalScore = score;

        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("1. Your final score was " + finalScore);
        }
    }
}

public class SkillMethod01
{
    public static void main(String[] args)
    {
        // Gọi/thực thi phương thức
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);
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

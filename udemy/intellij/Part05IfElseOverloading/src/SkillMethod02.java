public class SkillMethod02
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Gọi/thực thi phương thức
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
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

public class SkillMethod03
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Gọi/thực thi phương thức
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The hightScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }
    // method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        int finalScore = score;

        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}

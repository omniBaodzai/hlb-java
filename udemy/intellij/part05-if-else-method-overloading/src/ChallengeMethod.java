public class ChallengeMethod
{
    public static void main(String[] args)
    {

//        String playerName = "Nam";
//        int playerScore = 25;
//
//        int highScorePosition = calculateHighScorePosition(playerScore);
//        displayHighScorePosition(playerName, highScorePosition);

        displayHighScorePosition("An", calculateHighScorePosition(1500));
        displayHighScorePosition("Binh", calculateHighScorePosition(1000));
        displayHighScorePosition("Cuong", calculateHighScorePosition(500));
        displayHighScorePosition("Dung", calculateHighScorePosition(100));
        displayHighScorePosition("Dung", calculateHighScorePosition(25));
    }

    // Method displayHighScorePosition
    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println( playerName + " managed to get into position " + highScorePosition +
                " on the high score list");
    }

    // Method calculateHighScorePosition
    public static int calculateHighScorePosition(int playerScore)
    {
        /* ---------------------------------------------------------------------------- */
        // Kiểu 1
//        if (playerScore >= 1000)
//        {
//            return 1;
//        }
//        else if (playerScore >= 500)
//        {
//            return 2;
//        }
//        else if (playerScore >= 100)
//        {
//            return 3;
//        }
//        else
//        {
//            return 4;
//        }
        /* ---------------------------------------------------------------------------- */
        // Kiểu 2:
//        if (playerScore >= 1000)
//        {
//            return 1;
//        }
//        else if (playerScore >= 500)
//        {
//            return 2;
//        }
//        else if (playerScore >= 100)
//        {
//            return 3;
//        }

//        return 4;
        /* ---------------------------------------------------------------------------*/
        // Kiểu 3:
        int position = 4;

        if (playerScore >= 1000)
        {
            position = 1;
        }
        else if (playerScore >= 500)
        {
            position = 2;
        }
        else if (playerScore >= 100)
        {
            position = 3;
        }

        return  position;
    }
}

public class MethodChallenge {

    System.out.println(displayHighScorePosition("Charles", 1500));

    public static void displayHighScorePosition(String playerName, int calculateHighScorePosition()) {
        return (playerName + " managed to get into " + calculateHighScorePosition() + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int score1 = 1;
        int score2 = 2;
        int score3 = 3;
        int score4 = 4;

        if (score >= 1000)
            return score1;

        if (score >= 500 && score < 1000)
            return score2;

        if (score >= 100 && score < 500)
            return score3;

        else return score4;
    }

}

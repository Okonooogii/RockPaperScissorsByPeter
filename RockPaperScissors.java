import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMovie = scanner.nextLine();

        if (playerMovie.equals("r") || playerMovie.equals("rock")) {
            playerMovie = ROCK;
        } else if (playerMovie.equals("p") || playerMovie.equals("paper")) {
            playerMovie = PAPER;
        } else if (playerMovie.equals("s") || playerMovie.equals("scissors")) {
            playerMovie = SCISSORS;
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMovie = "";
        switch (computerRandomNumber) {
            case 1:
                computerMovie = "rock";
                break;
            case 2:
                computerMovie = "paper";
                break;
            case 3:
                computerMovie = "scissors";
                break;
        }
        if ((playerMovie.equals(ROCK) && computerMovie.equals(SCISSORS)) ||
                (playerMovie.equals(PAPER) && computerMovie.equals(ROCK)) ||
                (playerMovie.equals(SCISSORS) && computerMovie.equals(PAPER))) {
            System.out.println("You win.");
        } else if ((playerMovie.equals(SCISSORS) && computerMovie.equals(SCISSORS)) ||
                (playerMovie.equals(ROCK) && computerMovie.equals(PAPER)) ||
                (playerMovie.equals(PAPER) && computerMovie.equals(SCISSORS))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }
}





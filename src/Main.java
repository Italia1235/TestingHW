public class Main {
    public static void main(String[] args) {

        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("John"), new Player("Bob"));
    }
}
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class GameTest {

    //GameWinnerConsolePrinter winnerPrinter = new GameWinnerConsolePrinter();

    @Test
    public void testPlayGame() {
        Player boba = new Player("Boba");
        Player biba = new Player("Biba");
        DiceImpl dice = Mockito.mock(DiceImpl.class);

        GameWinnerConsolePrinter winnerPrinter = Mockito.mock(GameWinnerConsolePrinter.class);
      // winnerPrinter = "Победитель, Biba";
  when(dice.roll()).thenReturn(5,3);
        doAnswer(answer -> {
            Player message = answer.getArgument(0, Player.class);
            assertEquals("Boba",message.getName());
            return null;
        }).when(winnerPrinter).printWinner(any(Player.class));



    Game game = new Game(dice,winnerPrinter);
        game.playGame(boba,biba);

    }
}
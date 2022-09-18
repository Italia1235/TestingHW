import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiceImplTest {
    Dice dice = new DiceImpl();

    @Test
    @DisplayName("Тест рандома")
    void roll() {
        Assertions.assertTrue(dice.roll() > 0);
        Assertions.assertTrue(dice.roll() <= 6);
    }
}
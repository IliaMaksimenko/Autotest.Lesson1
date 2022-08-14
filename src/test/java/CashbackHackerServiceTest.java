import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldAdviseToBuy() {

        CashbackHackerService cashbackHacker = new CashbackHackerService();

        int amount = 900;

        int actual = cashbackHacker.remain(amount);

        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    public void theAmountIsMultiple() {

        CashbackHackerService cashbackHacker = new CashbackHackerService();

        int amount = 1000;

        int actual = cashbackHacker.remain(amount);

        int expected = 0;

        assertEquals(expected, actual);


    }

}
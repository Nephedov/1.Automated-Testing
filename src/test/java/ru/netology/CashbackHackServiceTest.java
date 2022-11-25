package ru.netology;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CashbackHackServiceTest {

    @Test
    public void amount1900Test() {
        var value = new CashbackHackService();

        assertEquals(value.remain(1999), 1);

    }

    @Test
    public void amount1Test() {
        var value = new CashbackHackService();

        assertEquals(value.remain(1), 999);

    }

    @Test
    public void amountZeroTest() {
        var value = new CashbackHackService();

        assertEquals(value.remain(0), 1000);

    }

    @Test
    public void amountMinus1Test() {
        var value = new CashbackHackService();

        assertEquals(value.remain(-1), 1001);

    }

    @Test
    public void amount1000Test() {
        var value = new CashbackHackService();

        assertThrows(AssertionError.class, () -> assertEquals(value.remain(1000), 0));

    }

}

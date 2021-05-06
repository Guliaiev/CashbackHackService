package ru.netology.service;

import org.junit.Test;
import org.junit. Assert;



public class CashbackHackServiceTest {

    @Test
    public void shouldReturn300IfAmountIs700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn600IfAmountIs1400() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;

        int actual = service.remain(amount);
        int expected = 600;

        Assert.assertEquals(actual, expected);
    }
};


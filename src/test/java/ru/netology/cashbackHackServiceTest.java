package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
class cashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        cashbackHackService service = new cashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void RemainIfAmountOne() {
        cashbackHackService service = new cashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void RemainIfAmountOverLimit() {
        cashbackHackService service = new cashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void RemainIfAmountIsLimit() {
        cashbackHackService service = new cashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void RemainIfAmountMax() {
        cashbackHackService service = new cashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void RemainIfAmountZero() {
        cashbackHackService service = new cashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}
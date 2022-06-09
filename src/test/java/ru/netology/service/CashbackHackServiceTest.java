package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateUnderLimit() {

            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(600);
            int expected = 400;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldCalculateOverLimit() {
            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(7500);
            int expected = 500;
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldCalculateLimit() {
            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(1000);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }

    @Test
    public void shouldCalculateNoAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    }
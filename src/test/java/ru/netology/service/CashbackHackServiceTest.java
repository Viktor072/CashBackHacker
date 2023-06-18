package ru.netology.service;

import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void Test1append450() {
        int amount = 550;

        int actual = service.remain(amount);
        int expected = 450;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test2append1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test3append60() {
        int amount = 940;

        int actual = service.remain(amount);
        int expected = 60;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test4append800() {
        int amount = 200;

        int actual = service.remain(amount);
        int expected = 800;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test5append0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test6append2() {
        int amount = 998;

        int actual = service.remain(amount);
        int expected = 2;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test7append998() {
        int amount = 2;

        int actual = service.remain(amount);
        int expected = 998;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test8append500IfMore1000() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test9append100IfMore1000() {
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Test10append1000IfMore1000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(actual, expected);
    }
}


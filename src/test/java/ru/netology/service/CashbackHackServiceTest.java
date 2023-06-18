package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void Test1append450() {
        int amount = 550;

        int actual = service.remain(amount);
        int expected = 450;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test2append1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test3append60() {
        int amount = 940;

        int actual = service.remain(amount);
        int expected = 60;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test4append800() {
        int amount = 200;

        int actual = service.remain(amount);
        int expected = 800;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test5append0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test6append2() {
        int amount = 998;

        int actual = service.remain(amount);
        int expected = 2;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test7append998() {
        int amount = 2;

        int actual = service.remain(amount);
        int expected = 998;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test8append500IfMore1000() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test9append100IfMore1000() {
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void Test10append1000IfMore1000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
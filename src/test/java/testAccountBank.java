import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static  org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

public class testAccountBank {
    CreditAccount sutFirst;
    SavingsAccount sutSecond;
    CheckingAccount sutThird;



    @BeforeAll
    public static void iniSut() {
        System.out.println("Running test");
    }

    @AfterAll
    public static void completeSut() {
        System.out.println("Test completed");
    }

    @BeforeEach
    public void initEachTestFirst() {
        double balance = 10;
        String name = "\"какое-то название #1\"";
        sutFirst = new CreditAccount(balance, name);
        System.out.println(CreditAccount.class + " создан");
    }

    @AfterEach
    public void afterEachTestFirst() {
        sutFirst = null;
        System.out.println(CreditAccount.class + " обнулен");
    }

    @BeforeEach
    public void initEachTestSecond() {
        double balance = 250;
        String name = "\"какое-то название #2\"";
        sutSecond = new SavingsAccount(balance, name);
        System.out.println(SavingsAccount.class + " создан");
    }

    @AfterEach
    public void afterEachTestSecond() {
        sutSecond = null;
        System.out.println(SavingsAccount.class + " обнулен");
    }

    @Test
    public void testAddMoneyCreditAccount() {
        int amout = 3;
        boolean expected = false;
        boolean result = sutFirst.addMoney(amout);
        assertEquals(expected, result);
    }
    @Test
    public void testAddMoneySavingAccount() {
        int amout = 10;
        boolean expected = false;
        boolean result = sutSecond.addMoney(amout);
        assertEquals(expected, result);

    }
    @Test
    public void payCheckingAccount () {
        int amount = 1000;
        boolean expected = true;
        boolean result = sutThird.pay(amount);
        assertEquals(expected, result);
    }

}

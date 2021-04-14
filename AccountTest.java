package africa.semicolon.mp3;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {

    @Test
    void customerAccountIsCreated() {
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        assertNotNull(account1);
    }

    @Test
    void accountsCanBeFunded() {
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        account1.deposit(new BigDecimal("500.0"));
        assertEquals(new BigDecimal("500.0"), account1.getBalance());
        assertEquals("Jane", account1.getName());
    }
    @Test
    void customerDepositIsAddedToBalance(){
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        account1.deposit(new BigDecimal("206.20"));
        account1.deposit(new BigDecimal("500.17"));
        assertEquals(new BigDecimal("706.37"), account1.getBalance());
    }
    @Test
    void customerCanNotDepositZeroAmountOrAmountLessThanZero(){
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        account1.deposit(new BigDecimal("500.0"));
        account1.deposit(new BigDecimal(-5));
        assertEquals(new BigDecimal("500.0"), account1.getBalance());
    }
    @Test
    void customerCanWithdrawCash(){
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        account1.deposit(new BigDecimal("800.10"));
        account1.withdraw(new BigDecimal("300.24"));
        assertEquals(new BigDecimal("499.86"), account1.getBalance());
    }
    @Test
    void customerCannotWithdrawNegativeAmount(){
        Account  account1 = new Account("Jane", new BigDecimal("0.0"));
        account1.withdraw(new BigDecimal("-1300.0"));
        assertEquals(new BigDecimal("0.0"), account1.getBalance());
    }
}

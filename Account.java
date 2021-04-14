package africa.semicolon.mp3;

import java.math.BigDecimal;

public class Account {
    private final String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {

        this.name = name;

        this.balance = balance;

    }
    public String getName() {
        return name;
    }
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0)
        balance = balance.add(depositAmount);
    }
    public void withdraw(BigDecimal withdrawAmount) {
        if (withdrawAmount.compareTo(BigDecimal.ZERO) > 0)
        balance = balance.subtract(withdrawAmount);
    }
    public BigDecimal getBalance() {
        return balance;
    }


}


import java.util.Objects;

public class Account3 {

    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static int accountCounter = 0;

    public Account3(String ownerName, long openingBalance) {
        accountCounter++;
        this.accountNumber = String.format("AC%04d", accountCounter);
        this.ownerName = ownerName;
        this.balance = Math.max(0, openingBalance);
        this.active = true;
    }

    public Account3(String ownerName) {
        this(ownerName, 0);
    }

    public Account3(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = Math.max(0, balance);
        this.active = true;
    }

    public void deposit(long amount) {
        if (amount > 0 && active) {
            balance += amount;
        }
    }

    public boolean withdraw(long amount) {
        if (amount <= 0 || !active || balance < amount) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return accountNumber + " | " + ownerName + " | " + balance
                + " | Active: " + active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Account3)) {
            return false;
        }

        Account3 other = (Account3) o;
        return accountNumber.equals(other.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public String getStatement() {
        return "Account Number: " + accountNumber
                + "\nOwner: " + ownerName
                + "\nBalance: Rs. " + balance
                + "\nActive: " + active;
    }
}

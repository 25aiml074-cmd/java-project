
public abstract class Account {

    protected String accountNumber;
    protected String ownerName;
    protected long balance;

    public Account(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public abstract double interestRate();

    public abstract boolean canWithdraw(long amount);

    public long getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double monthlyInterest() {
        return balance * interestRate() / 100.0 / 12;
    }
}

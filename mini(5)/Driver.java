
public class Driver {

    public static void main(String[] args) {

        Account[] accounts = {
                new SavingsAccount("AC0001", "Riya", 10000, 2000),
                new CurrentAccount("AC0002", "Amit", 5000, 3000),
                new FixedDepositAccount("AC0003", "Neha", 20000)
        };

        double totalInterest = 0;

        for (Account account : accounts) {

            System.out.println("\nAccount Number: "
                    + account.getAccountNumber());

            System.out.println("Owner: "
                    + account.getOwnerName());

            System.out.println("Balance: Rs. "
                    + account.getBalance());

            System.out.println("Interest Rate: "
                    + account.interestRate() + "%");

            System.out.println("Monthly Interest: Rs. "
                    + account.monthlyInterest());

            totalInterest += account.monthlyInterest();

            if (account instanceof SavingsAccount savings) {
                System.out.println(
                        "Type: Savings Account");
            } else if (account instanceof CurrentAccount current) {
                System.out.println(
                        "Type: Current Account");
            } else if (account instanceof FixedDepositAccount fd) {
                System.out.println(
                        "Type: Fixed Deposit Account");
            }

            System.out.println("Can withdraw Rs. 1000? "
                    + account.canWithdraw(1000));
        }

        System.out.println("\nTotal Monthly Interest: Rs. "
                + totalInterest);
    }
}


public class MiniBank2 {

    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new Account("Riya", 5000);
        accounts[1] = new Account("Aman");
        accounts[2] = new Account("Priya", 3000);

        accounts[0].deposit(1000);
        accounts[1].deposit(2000);
        accounts[2].withdraw(500);

        accounts[0].withdraw(1500);
        accounts[1].withdraw(500);

        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner: " + account.getOwnerName());
            System.out.println("Balance: Rs. " + account.getBalance());
            System.out.println("-------------------------");
        }
    }
}

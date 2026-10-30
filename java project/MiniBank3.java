
public class MiniBank3 {

    public static void main(String[] args) {

        Account3 a1 = new Account3("AC0001", "Riya", 5000);
        Account3 a2 = new Account3("AC0001", "Riya", 2500);
        Account3 a3 = new Account3("Aman", 3000);

        a1.withdraw(1000);
        a3.deposit(500);

        System.out.println("Account Details:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\nAre a1 and a2 equal? " + a1.equals(a2));
        System.out.println("Are a1 and a3 equal? " + a1.equals(a3));

        Object obj = a1;
        System.out.println("Is obj an Account3? " + (obj instanceof Account3));

        Customer3.Address address = new Customer3.Address(
                "12 Green Street", "Anand", "388001");

        Customer3 customer = new Customer3(
                "Riya", "riya@example.com", "9876543210", address);

        Customer3 copy = customer.clone();

        System.out.println("\nCustomer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Customer Mobile: " + customer.getMobile());
        System.out.println("Customer City: " + customer.getAddress().getCity());
        System.out.println("Cloned Customer: " + copy.getName());

        System.out.println("\nAccount Statement:");
        System.out.println(a1.getStatement());
    }
}


public class Driver {

    public static void main(String[] args) {

        System.out.println("MOBILE VALIDATION");
        System.out.println(Validator.isValidMobile("9876543210"));
        System.out.println(Validator.isValidMobile("12345"));

        System.out.println("\nEMAIL VALIDATION");
        System.out.println(Validator.isValidEmail("abc@xyz.com"));
        System.out.println(Validator.isValidEmail("abcxyz.com"));

        System.out.println("\nPAN VALIDATION");
        System.out.println(Validator.isValidPan("ABCDE1234F"));
        System.out.println(Validator.isValidPan("12345ABCDE"));

        System.out.println("\nIFSC VALIDATION");
        System.out.println(Validator.isValidIfsc("SBIN0001234"));
        System.out.println(Validator.isValidIfsc("12345"));

        System.out.println("\nAMOUNT VALIDATION");
        System.out.println(Validator.isValidAmount("500"));
        System.out.println(Validator.isValidAmount("-500"));

        System.out.println("\nCOMMAND PARSING");

        Command command = CommandParser.parse(
                "DEPOSIT AC0001 500");

        System.out.println("Type: " + command.type());
        System.out.println("Account Number: " +
                command.accountNumber());
        System.out.println("Amount: " + command.amount());

        System.out.println("\nACCOUNT STATEMENT");

        Account account = new Account("Riya");

        System.out.println(
                StatementFormatter.buildStatement(account));
    }
}

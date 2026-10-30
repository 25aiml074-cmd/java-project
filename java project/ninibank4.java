
public class MiniBank4 {
    public static void main(String[] args) {
        System.out.println("Mobile Tests:");
        System.out.println(Validator.isValidMobile("9876543210"));
        System.out.println(Validator.isValidMobile("12345"));

        System.out.println("\nEmail Tests:");
        System.out.println(Validator.isValidEmail("abc@xyz.com"));
        System.out.println(Validator.isValidEmail("abcxyz.com"));

        System.out.println("\nPAN Tests:");
        System.out.println(Validator.isValidPan("ABCDE1234F"));
        System.out.println(Validator.isValidPan("12345ABCDE"));

        System.out.println("\nIFSC Tests:");
        System.out.println(Validator.isValidIfsc("SBIN0001234"));
        System.out.println(Validator.isValidIfsc("12345"));

        System.out.println("\nAmount Tests:");
        System.out.println(Validator.isValidAmount("500"));
        System.out.println(Validator.isValidAmount("-50"));

        Command command = CommandParser.parse("DEPOSIT AC0001 500");

        System.out.println("\nParsed Command:");
        System.out.println("type=" + command.type());
        System.out.println("accountNumber=" + command.accountNumber());
        System.out.println("amount=" + command.amount());
    }
}

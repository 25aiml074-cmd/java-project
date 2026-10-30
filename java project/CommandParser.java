
public class CommandParser {
    public static Command parse(String line) {
        if (line == null || line.trim().isEmpty()) {
            throw new IllegalArgumentException("Command cannot be empty");
        }

        String[] parts = line.trim().split("\\s+");

        if (parts.length != 3) {
            throw new IllegalArgumentException(
                    "Command must contain exactly 3 parts");
        }

        TransactionType type;
        long amount;

        try {
            type = TransactionType.valueOf(parts[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Invalid transaction type: " + parts[0]);
        }

        if (!Validator.isValidAmount(parts[2])) {
            throw new IllegalArgumentException(
                    "Amount must be a positive whole number");
        }

        try {
            amount = Long.parseLong(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Amount is too large");
        }

        if (parts[1].isBlank()) {
            throw new IllegalArgumentException("Account number is required");
        }

        return new Command(type, parts[1], amount);
    }
}

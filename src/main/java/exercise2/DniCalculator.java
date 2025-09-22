package exercise2;

public class DniCalculator {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 0) {
            throw new IllegalArgumentException("DNI number cannot be negative.");
        }
        int index = dniNumber % 23;
        return LETTERS.charAt(index);
    }
}

package exercise2;

public class DniCalculator {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 0|| dniNumber > 99_999_999) {
            throw new IllegalArgumentException("DNI number must be an 8-digit positive number.");
        }
        int index = dniNumber % 23;
        return LETTERS.charAt(index);
    }
}

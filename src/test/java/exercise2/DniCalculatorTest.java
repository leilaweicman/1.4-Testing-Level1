package exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DniCalculatorTest {
    private static Stream<Arguments> dniDataProvider() {
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(87654321, 'X'),
                Arguments.of(11111111, 'H'),
                Arguments.of(22222222, 'J'),
                Arguments.of(33333333, 'P'),
                Arguments.of(44444444, 'A'),
                Arguments.of(55555555, 'K'),
                Arguments.of(66666666, 'Q'),
                Arguments.of(77777777, 'B'),
                Arguments.of(88888888, 'Y')
        );
    }


    @ParameterizedTest
    @MethodSource("dniDataProvider")
    void shouldCalculateCorrectLetterForValidDni(int dniNumber, char expectedLetter) {
        char result = DniCalculator.calculateLetter(dniNumber);
        assertEquals(expectedLetter, result, () -> "Expected " + expectedLetter + " but got " + result + " for DNI " + dniNumber);
    }
}

package exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionExampleTest {

    @Test
    void testArrayIndexOutOfBoundsException() {
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                ExceptionExample::causeException,
                "The method should throw ArrayIndexOutOfBoundsException when accessing invalid index"
        );
    }

}

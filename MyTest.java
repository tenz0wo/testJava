import org.junit.jupiter.api.Test;
import ru.koryshev.task3.StringValidator;

import static org.junit.jupiter.api.Assertions.*;


public class MyTest {
    @Test
    public void testIsValidString_ValidString() {
        String input = "abcd";
        boolean isValid = StringValidator.isValidString(input);
        assertTrue(isValid);
    }

    @Test
    public void testIsValidString_InvalidCharacter() {
        String input = "abc*";
        boolean isValid = StringValidator.isValidString(input);
        assertFalse(isValid);
    }

    @Test
    public void testIsValidString_ExceedsMaxLength() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        boolean isValid = StringValidator.isValidString(input);
        assertFalse(isValid);
    }
}

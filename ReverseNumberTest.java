import africa.semicolon.mp3.ReverseNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest {
    private ReverseNumber number;
    @BeforeEach
    void AllTestStartsWith(){
        number = new ReverseNumber();
    }
    @Test
    void reverseNumberCanBeCreated(){
        assertNotNull(number);
    }
    @Test
    void numberCanBeReversed(){
        number.SetNumber(7631);
        assertEquals(1367, number.getNumber());
    }
}

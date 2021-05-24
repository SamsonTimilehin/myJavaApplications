package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CompareToMethodTest {
    @Test
    void checkUserInput(){
    assertEquals(compareInput("hello","hello"), 0);
    assertEquals(compareInput("john", "james"),14);
    }
    int compareInput(String firstInput, String secondInput){
    return firstInput.compareTo(secondInput);
    }

}

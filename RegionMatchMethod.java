package chapter14;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class RegionMatchMethod {
    @Test
    void checkUserInput(){
    assertTrue(compareInputs("hello","hello"));
    assertTrue(compareInputs("hello","HELLO"));
    assertTrue(compareInputs("HELLO","hello"));
    }
    boolean compareInputs(String input1, String input2){

        return input1.toLowerCase().regionMatches(2,input2.toLowerCase(),2, 3);

    }

}

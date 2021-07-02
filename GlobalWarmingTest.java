package chapterFive;

import Chapter_Five.GlobalWarming;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GlobalWarmingTest {

    GlobalWarming globalWarming;

    @BeforeEach
    void everyTestShouldStartWith(){
        globalWarming = new GlobalWarming();
    }
    @Test
    void questionsCanBeCreated(){
        assertNotNull(globalWarming);
    }
    @Test
    void testThatQuestionsCanBeDisplayed(){
        assertEquals( "2. what is her brother's name?\n A. John\n B. Peter\n C. Jane\n D. Michael", globalWarming.displayQuestion(2));

    }
    @Test
    void usersCanSelectAnswer(){
        globalWarming.displayQuestion(3);
        assertEquals("B", globalWarming.getSelectAnswer("B"));
    }
    @Test
    void userCanKnowTheirScores(){
        globalWarming.displayQuestion(1);
        globalWarming.getSelectAnswer("D");
        globalWarming.displayQuestion(2);
        globalWarming.getSelectAnswer("C");
        globalWarming.displayQuestion(3);
        globalWarming.getSelectAnswer("B");
        globalWarming.displayQuestion(4);
        globalWarming.getSelectAnswer("A");
        globalWarming.displayQuestion(5);
        globalWarming.getSelectAnswer("D");
        assertEquals(5, globalWarming.getScore());

    }
    @Test
    void testThatUserCanNotPickAQuestionTwice(){
        globalWarming.displayQuestion(1);
        globalWarming.getSelectAnswer("D");
        globalWarming.displayQuestion(2);
        globalWarming.getSelectAnswer("C");
        globalWarming.displayQuestion(3);
        globalWarming.getSelectAnswer("B");
        assertThrows(IllegalArgumentException.class,()->globalWarming.displayQuestion(1));
    }
}
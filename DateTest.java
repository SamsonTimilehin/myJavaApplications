package africa.semicolon.mp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {
   private Date date;
   @BeforeEach
   void  AllTestStartsWith(){
       date = new Date();
   }
    @Test
    void dateCanBeCreate(){
        Date date = new Date();
        assertNotNull(date);
    }
    @Test
    void dateCanBeSet(){
        date.setMonth(12);
        assertEquals(12, date.getMonth());
        date.setDay(28);
        assertEquals(28, date.getDay());
        date.setYear(2000);
        assertEquals(2000, date.getYear());
    }
    @Test
    void dateCanBeDisplay(){
        date.setMonth(12);
        date.setDay(28);
        date.setYear(2000);
        assertEquals("12/28/2000", date.displayDate());
    }
    @Test
    void monthCanBeSetWithinOneToTwelve(){
        date.setMonth(12);
        date.setMonth(9);
        date.setDay(28);
        date.setYear(2000);
        assertEquals("9/28/2000", date.displayDate());
    }
    @Test
    void dayCanBeSetToNumbersWithinOneToThirtyOne(){

        date.setMonth(9);
        date.setDay(25);
        date.setYear(2000);
        assertEquals("9/25/2000", date.displayDate());
    }
    @Test
    void yearCanBeSetToNumberWithin1900To30001(){
        date.setMonth(9);
        date.setDay(25);
        date.setYear(2001);
        assertEquals("9/25/2001", date.displayDate());
    }
    @Test
     void identifyAndThrowErrorForInvalidMonthDate(){
        date.setDay(30);
        date.setYear(2000);
        assertThrows(IllegalArgumentException.class,() -> date.setMonth(23));
    }
    @Test
    void identifyAndThrowErrorForInvalidDayDate(){
        date.setMonth(10);
        date.setYear(3000);
        assertThrows(IllegalArgumentException.class,() -> date.setDay(40));
    }
    @Test
    void identifyAndThrowErrorForInvalidYearDate(){
        date.setMonth(11);
        date.setDay(30);
        assertThrows(IllegalArgumentException.class,() -> date.setYear(5000));
    }
}

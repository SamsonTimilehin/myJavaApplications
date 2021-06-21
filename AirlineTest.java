package airlineReservation;

import Airline.Flight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {

    Flight flight;

    @BeforeEach
    void startAllTestWithThis(){
        flight=new Flight();
    }

    @Test
    void airlineFlightCanBeCreated() {
        assertNotNull(flight);
    }

    @Test
    void testThatCustomersCanBookFirstClassSeat(){
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);


        assertEquals(5,flight.getFirstClassNumberOfSeats());

    }
    @Test
    void testThatCustomersCanBookEconomySeat(){
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        assertEquals(5,flight.getAssignEconomyClassSeat());
    }

    @Test
    void testThatFirstClassAndEconomyClassCanBeBooked(){
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);

        assertEquals(2,flight.getFirstClassNumberOfSeats());
        assertEquals(3,flight.getAssignEconomyClassSeat());
    }
    @Test
    void testThatFirstClassSeatIsEmpty(){
        flight.firstClassSeatsAreEmpty();
        assertTrue(flight.getFirstClassSeatAreEmpty());
    }
    @Test
    void testThatFirstClassIsFull(){
        flight.firstClassIsFull();
        assertTrue(flight.getFirstClassIsFull());
    }
        @Test
    void testThatCustomerCannotBookAboveFiveSeatsForFirstClass(){
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);
        flight.assignFirstClassSeat(1);

        assertThrows(IllegalArgumentException.class,()-> flight.assignFirstClassSeat(1));
    }
    @Test
    void testThatEconomyClassSeatIsEmpty(){
        flight.economyClassSeatsAreEmpty();
        assertTrue(flight.getEconomyClassSeatAreEmpty());
    }
    @Test
    void testThatEconomyClassIsFull(){
        flight.economyClassIsFull();
        assertTrue(flight.getEconomyClassIsFull());
    }
    @Test
    void testThatCustomerCannotBookAboveFiveSeatsForEconomyClass() {
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);
        flight.assignEconomyClassSeat(2);

        assertThrows(IllegalArgumentException.class, () -> flight.assignEconomyClassSeat(2));
    }
}
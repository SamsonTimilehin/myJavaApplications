package Airline;

public class Flight {
   private final boolean[] seats = new boolean[10];
   private int firstClassSeats;
   private int economyClassSeats;



    public void assignFirstClassSeat(int seatNumber) {
                if (seatNumber == 1 && firstClassSeats <= 4) {
                    seats[firstClassSeats] = true;
                    firstClassSeats++;
                }else throw new IllegalArgumentException("First Class seats are occupied!");
    }

    public int getFirstClassNumberOfSeats() {
        return firstClassSeats;
    }

    public void assignEconomyClassSeat(int seatNumber) {
        if(seatNumber == 2 && economyClassSeats < 5 ){
            seats[5 + economyClassSeats]=true;
            economyClassSeats++;
        }else throw new IllegalArgumentException("Economy Class seats are occupied!");
    }

    public int getAssignEconomyClassSeat() {
        return economyClassSeats;
    }

    public void firstClassSeatsAreEmpty() {
        this.firstClassSeats = firstClassSeats-1;
    }

    public boolean getFirstClassSeatAreEmpty() {
        return firstClassSeats ==-1;
    }

    public void firstClassIsFull() {
        this.firstClassSeats = 4;

    }

    public boolean getFirstClassIsFull() {
        return firstClassSeats == 4;
    }


    public void economyClassSeatsAreEmpty() {
        this.economyClassSeats = -1;
    }

    public boolean getEconomyClassSeatAreEmpty() {
        return economyClassSeats == -1 ;
    }

    public void economyClassIsFull() {
        this.economyClassSeats = 4;
    }

    public boolean getEconomyClassIsFull() {
        return economyClassSeats == 4;
    }
}




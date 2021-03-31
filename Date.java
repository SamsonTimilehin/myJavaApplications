package africa.semicolon.mp3;

public class Date {
    private int month;
    private int day;
    private int year;


    public String displayDate() {
        String currentDate = month + "/" + day + "/" + year;
        return currentDate;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12 ) {
            throw new IllegalArgumentException("Invalid month! Number out of range");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if(day <= 0 || day > 31) {
            throw new IllegalArgumentException("Invalid day! Number out of range");
        }
        this.day = day;
    }

    public void setYear(int year) {
        if(year < 1900 || year > 3001) {
            throw new IllegalArgumentException("Invalid year! Number out of range");
        }
            this.year = year;
    }

    public int getMonth() {

        return month;
    }

    public int getDay() {

        return day;
    }

    public int getYear() {
        return year;
    }
}

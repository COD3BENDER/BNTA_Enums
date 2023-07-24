import java.awt.print.Book;

public class Booking {

    private String name;
    private int weekNumber;

    private Enum weekday;

    public Booking(String name, int weekNumber,Enum weekday){
        this.name = name;
        this.weekNumber = weekNumber;
        this.weekday = weekday;
    }

    public Enum getWeekday() {
        return this.weekday;
    }
}

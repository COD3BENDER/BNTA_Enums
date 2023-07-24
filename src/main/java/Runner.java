public class Runner {


    public static void main(String[] args) {
        Booking booking = new Booking("Tarek",4,Weekday.MONDAY);
        System.out.println(booking.getWeekday()); // Enums are displayed as non-mutable strings
        // you cant change it, its good in this case where you can only choose mon - fri
        // since in the normal case you can add any string and the code will still work
        // this is good as it limits what end users can enter.

        for(Weekday weekday: Weekday.values()){
            System.out.println(weekday.getGerman()); // can also retrieve properties of an enum
        }

        Weekday today = Weekday.FRIDAY;

        if(today.equals(Weekday.MONDAY)){
            System.out.println("oh no, its monday");
        }

        switch (today){
            case MONDAY -> System.out.println("Oh no, its monday");
            case TUESDAY -> System.out.println("Alright, its tuesday");
            case WEDNESDAY-> System.out.println("Nice, its wednesday");
            case THURSDAY -> System.out.println("almost there, its thursday");
            case FRIDAY -> System.out.println("yay, its friday");

        }
    }
}

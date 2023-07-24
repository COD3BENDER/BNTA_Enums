public enum Weekday {
    //Not a good idea to put the name enum into the name of the class (conventional)
    MONDAY("Monntag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german; // you add final as the string will not be changed, final does this.

    Weekday(String german){
        this.german = german;
    }

    public String getGerman() {
        return this.german; // needs to be string type as you are returning a string property
    }

}

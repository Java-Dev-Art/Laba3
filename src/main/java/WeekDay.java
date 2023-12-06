public enum WeekDay {
    MONDAY(1, "MON"),
    TUESDAY(2, "TUE"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "THU"),
    FRIDAY(5, "FRI"),
    SATURDAY(6,"SAT"),
    SUNDAY(7, "SUN");

    private final int number;
    private final String abbreviation;

    WeekDay(int number, String abbreviation) {
        this.number = number;
        this.abbreviation = abbreviation;
    }

    public int getNumber() {
        return number;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

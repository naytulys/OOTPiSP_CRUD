package entities;

public class Birth {
    public enum Month{
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JUL,
        AUG,
        SEP,
        OCT,
        NOV,
        DEC;
    }

    private int day;
    private Month month;
    private int year;
}

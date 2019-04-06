public abstract class Cinema {

    private String CinemaName;

    Cinema(String cinemaName) {
        CinemaName = cinemaName;
    }

    public String getCinemaName() {
        return CinemaName;
    }

    abstract Film[] createFilmsArray(WeekDay weekDay, Film[] films);
}

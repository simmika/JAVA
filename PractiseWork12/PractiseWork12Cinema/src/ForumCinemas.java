public class ForumCinemas extends Cinema {

    ForumCinemas(String cinemaName) {
        super(cinemaName);
    }

    @Override
    protected Film[] createFilmsArray(WeekDay weekDay, Film[] films) {
        // 1 - Monday
        // 2 - Tueday
        // 3 - Wednesday
        TimeTable timeTable = new TimeTable();
        timeTable.createFilmsTimeTable(weekDay, films);

        return films;
    }
}

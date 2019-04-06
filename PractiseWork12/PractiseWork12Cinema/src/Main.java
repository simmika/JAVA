public class Main {
    public static void main(String[] args) {

        Cinema cinema = new ForumCinemas("Forum cinemas");

        Film[] films = {
                new Film("Terminator1", "Action"),
                new Film("Terminator2", "Action"),
                new Film("Terminator3", "Action"),
                new Film("Terminator4", "Action"),
                new Film("Terminator5", "Action"),
                new Film("Terminator6", "Action")
        };

        for (WeekDay weekDay : WeekDay.values()) {
            // 1 - Monday
            // 2 - Tuesday
            // 3 - Wednesday
            cinema.createFilmsArray(weekDay, films);
        }
    }
}

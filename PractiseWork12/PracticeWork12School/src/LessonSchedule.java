public class LessonSchedule {
    private final Lesson lesson;
    private final Personal personal;
    private final Pupil[] pupils;
    private final String weekday;
    private final String time;

    public LessonSchedule(Lesson lesson, Personal personal, Pupil[] pupils, String weekday, String time) {
        this.lesson = lesson;
        this.personal = personal;
        this.pupils = pupils;
        this.weekday = weekday;
        this.time = time;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Personal getPersonal() {
        return personal;
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public String getWeekday() {
        return weekday;
    }

    public String getTime() {
        return time;
    }
}

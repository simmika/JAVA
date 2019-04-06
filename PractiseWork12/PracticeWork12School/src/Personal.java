public class Personal {

    private final String name;
    private final Pupil[] pupils;
    private final Lesson[] lessons;

    public Personal(
            String name,
            Pupil[] pupils,
            Lesson[] lessons
    ) {
        this.name = name;
        this.pupils = pupils;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public Lesson[] getLessons() {
        return lessons;
    }
}

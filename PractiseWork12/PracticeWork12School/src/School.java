class School {

    private final Personal[] personals;
    private final Pupil[] pupils;
    private final LessonSchedule[] lessonSchedules;

    public School(Personal[] personals, Pupil[] pupils, LessonSchedule[] lessonSchedules) {
        this.personals = personals;
        this.pupils = pupils;
        this.lessonSchedules = lessonSchedules;
    }

    public Personal[] getPersonals() {
        return personals;
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public LessonSchedule[] getLessonSchedules() {
        return lessonSchedules;
    }
}

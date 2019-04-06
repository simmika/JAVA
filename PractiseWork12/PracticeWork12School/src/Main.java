
public class Main {

    public static void main(String[] args) {

        Pupil[] pupils = {
                new Pupil("Toma", 8, "2"),
                new Pupil("Kauptukas", 12, "5"),
                new Pupil("Barstis", 6, "1"),
                new Pupil("Ruta", 20, "6"),
                new Pupil("Dantis", 16, "10")
        };
        Lesson[] lessons = {
                new Lesson("English"),
                new Lesson("Art"),
                new Lesson("Physical"),
                new Lesson("Chemistry"),
                new Lesson("Biology")
        };
        Personal[] personals = {
                new Personal(
                        "Ieva",
                        new Pupil[]{ pupils[0], pupils[1] },
                        new Lesson[]{ lessons[0] } // english
                ),
                new Personal(
                        "Roze",
                        new Pupil[]{ pupils[2], pupils[3], pupils[4] },
                        new Lesson[]{ lessons[1] }
                ),
                new Personal(
                        "Grybas",
                        new Pupil[]{ pupils[3], pupils[4] },
                        new Lesson[]{ lessons[2], lessons[3] }
                ),
                new Personal(
                        "Justas",
                        new Pupil[]{ pupils[1], pupils[2] },
                        new Lesson[]{ lessons[4] }
                )
        };

        LessonSchedule[] lessonSchedules = {
                new LessonSchedule(lessons[0], personals[0], pupils, "Monday", "9:00"),
                new LessonSchedule(lessons[1], personals[1], new Pupil[] { pupils[0], pupils[1] }, "Tuesday", "10:00"),
                new LessonSchedule(lessons[2], personals[2], new Pupil[] { pupils[2], pupils[3] }, "Tuesday", "12:00"),
                new LessonSchedule(lessons[3], personals[3], new Pupil[] { pupils[2], pupils[4] }, "Friday", "17:00"),
        };

        School school = new School(personals, pupils, lessonSchedules);

        System.out.println("\n\nPersonalas: ");
        for (Personal personal: school.getPersonals()) {
            System.out.println(personal.getName());
        }

        System.out.println("\n\nMokiniai: ");
        for (Pupil pupil: school.getPupils()) {
            System.out.println(pupil.getName());
        }

        System.out.println("\n\nPamokos:");
        for (LessonSchedule lessonSchedule: school.getLessonSchedules()) {
            System.out.print(
                    lessonSchedule.getLesson().getName() +
                    ", kuria veda " +
                    lessonSchedule.getPersonal().getName() +
                    ", mokinasi: "
            );
            for (Pupil pupil: lessonSchedule.getPupils()) {
                System.out.print(pupil.getName() + ", ");
            }

            System.out.print("vyksta: " + lessonSchedule.getWeekday() + " diena, " + lessonSchedule.getTime() + " valanda");
            System.out.println();
        }
    }
}

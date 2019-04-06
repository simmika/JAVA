import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class TimeTable {
    // 1 - list = []
    // 2 - list = []
    // 3 - list = []
    private List<Film[]> list = new ArrayList<>();

    void createFilmsTimeTable(WeekDay weekDay, Film[] films) {

        Collections.shuffle(Arrays.asList(films));

        // 1 - lust[0] = films
        // 2 - list[0] = films
        // 3 - list[0] = films
        list.add(films);

        try {
            BufferedWriter fout = new BufferedWriter(new FileWriter("index.html", true));

            System.out.println("________________________________________________");
            System.out.println(weekDay.name());
            System.out.println("________________________________________________");

            fout.write(weekDay.name());
            fout.write("<ul>\n");

            // 1 - list = 1 length size
            // 2 - list = 1 length size
            for (Film[] f: list) {
                // f = films, suffled
                for (int i = 0; i < f.length; i++){
                    fout.write("<li>");
                    fout.write(f[i].getFilmName());
                    System.out.println(f[i].getFilmName());
                    fout.write("</li>\n");
                }
            }

            fout.write("</ul>\n");

            fout.close();

        } catch (IOException ex){
            System.out.println("File read / write error" + ex);
        }
    }
}

public class Film {
    private String filmName;
    private String filmGenre;

    public Film() {
    }

    ;

    public Film(String filmName, String filmGenre) {
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    @Override
    public String toString() {
        return "Title name: " + filmName + ", film genre: " + filmGenre;
    }
}

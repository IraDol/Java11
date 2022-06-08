package Domain;

public class Movie {    // класс описывает одну строку

    private String nameMovie;
    private String genre;
    private int id;

    public Movie(String nameMovie, String genre, int id) {
        this.nameMovie = nameMovie;
        this.genre = genre;
        this.id = id;
    }
    public Movie (){
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
}

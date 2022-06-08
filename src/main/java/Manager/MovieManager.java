package Manager;

import Domain.Main;
import Domain.Movie;

public class MovieManager {
    private Movie [] movies = new Movie[0];  //созд поле под массив пока нулевой
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }
    public MovieManager() {
        this.limit = 10;
    }


    public void add (Movie movie) {             //метод доб
        int length = movies.length +1;
        Movie[] movies2 = new Movie[length];        //нов массив с вычисляемой длиной
        System.arraycopy(movies, 0, movies2, 0,movies.length);
        int newFilm = movies2.length - 1;        // куда кладем посл элемент
        movies2 = movies;

    }

    // метод Вывод всех фильмов

    public Movie[] findAll() {
        return movies;
    }

    // третий метод

   public Movie[] findLast () {                   // Сначала посмотреть, что сохранено в массиве через метод findAll
                                                  // Потом вычислить длину результирующего массива,
                                                  // создать нов результирующий массив в обратном порядке

       Movie[] movies = findAll();       // ???
       int resultLength = 0;
       boolean isLimited = true;

        if (isLimited) {
            resultLength = limit;
        } else
       resultLength = 10;
        Movie [] result = new Movie[resultLength];
        for (int i=0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result [i] = movies [index];
        }
        return result;
    }



}

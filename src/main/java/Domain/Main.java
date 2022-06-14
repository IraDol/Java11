package Domain;

import Manager.MovieManager;

public class Main {
    public static void main(String[] args) {
        Movie first = new Movie("First", "Comedy", 111);
        Movie second = new Movie("Second", "Detective", 222);
        Movie third = new Movie("Third", "Drama", 333);
        Movie fourth = new Movie("Fourth", "Dorama", 444);

        MovieManager movie = new MovieManager();   // пустой объект ?
        movie.add(first);
        movie.add(second);
        movie.add(third);
        Movie[] all = movie.findAll();
        Movie[] lastRevers = movie.findLast();

    }


}

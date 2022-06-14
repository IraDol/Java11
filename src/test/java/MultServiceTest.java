import Domain.Movie;
import Manager.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultServiceTest {
    Movie first = new Movie("First", "Comedy", 111);
    Movie second = new Movie("Second", "Detective", 222);
    Movie third = new Movie("Third", "Drama", 333);
    Movie fourth = new Movie("Fourth", "Dorama", 444);
    Movie fifth = new Movie("Fifth", "Horror", 555);
    Movie sixth = new Movie("Sixth", "Thriller", 666);
    Movie seventh = new Movie("Sixth", "Thriller", 777);
    Movie eighth = new Movie("Sixth", "Thriller", 888);
    Movie ninth = new Movie("Sixth", "Thriller", 999);
    Movie tenth = new Movie("Sixth", "Thriller", 1111);

    @Test
    public void addFourthMovie() {
        MovieManager movies = new MovieManager();
        movies.add(first);         //доб три элемента
        movies.add(second);
        movies.add(third);
        // тестируемое действие

        movies.add(fourth);

        Movie[] actual = movies.findAll();
        Movie[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void addEmptyField() {
        MovieManager movies = new MovieManager();

        // тестируемое действие

        movies.add(first);
        movies.add(fifth);

        Movie[] actual = movies.findAll();

        Movie[] expected = {first, fifth};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllTest() {
        MovieManager movies = new MovieManager();
        movies.add(first);
        movies.add(second);
        movies.add(third);
        movies.add(fourth);
        movies.add(fifth);
        movies.add(sixth);
        movies.add(seventh);
        movies.add(eighth);
        movies.add(ninth);
        movies.add(tenth);

        movies.findLast();

        Movie[] actual = movies.findLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllLimit() {
        MovieManager movies = new MovieManager(5);
        movies.add(first);
        movies.add(second);
        movies.add(third);
        movies.add(fourth);
        movies.add(fifth);
        movies.add(sixth);
        movies.add(seventh);
        movies.add(eighth);
        movies.add(ninth);
        movies.add(tenth);

        movies.findLast();

        Movie[] actual = movies.findLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(actual, expected);


    }
}

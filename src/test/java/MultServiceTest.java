import Domain.Movie;
import Manager.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultServiceTest {
    Movie first = new Movie("First", "Comedy", 111);
    Movie second = new Movie("Second", "Detective", 222);
    Movie third = new Movie("Third", "Drama", 333);
    Movie fourth = new Movie("Fourth", "Dorama", 444);

    @Test
    public void myTest(){
        MovieManager movies = new MovieManager();
        movies.add(first);         //доб три элемента
        movies.add(second);
        movies.add(third);
        // тестируемое действие

        movies.add(fourth);

        Movie [] actual = movies.findAll();
        Movie[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(actual,expected);


    }
}

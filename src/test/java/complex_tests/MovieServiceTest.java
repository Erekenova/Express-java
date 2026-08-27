package complex_tests;

import complex_tasks.task4.Movie;
import complex_tasks.task4.MovieService;
import complex_tasks.task4.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    private MovieService service;
    private Movie movie1;
    private Movie movie2;

    @BeforeEach
    void setUp() {
        service = new MovieService();
        movie1 = new Movie("Inception");
        movie2 = new Movie("Interstellar");
    }

    @Test
    void addIntegerRatingTest() {
        service.addRating(movie1, new Rating<>(10));
        service.addRating(movie1, new Rating<>(8));

        assertEquals(9.0, service.getAverageRating(movie1));
    }

    @Test
    void addDoubleRatingTest() {
        service.addRating(movie1, new Rating<>(9.5));
        service.addRating(movie1, new Rating<>(8.5));

        assertEquals(9.0, service.getAverageRating(movie1));
    }

    @Test
    void averageRatingTest() {
        service.addRating(movie1, new Rating<>(10));
        service.addRating(movie1, new Rating<>(9));
        service.addRating(movie1, new Rating<>(8));

        assertEquals(9.0, service.getAverageRating(movie1));
    }

    @Test
    void emptyMovieRatingTest() {
        assertEquals(0.0, service.getAverageRating(movie1));
    }

    @Test
    void invalidLowRatingTest() {
        assertThrows(IllegalArgumentException.class,
                () -> service.addRating(movie1, new Rating<>(0)));
    }

    @Test
    void invalidHighRatingTest() {
        assertThrows(IllegalArgumentException.class,
                () -> service.addRating(movie1, new Rating<>(11)));
    }

    @Test
    void sortMoviesByRatingTest() {

        service.addRating(movie1, new Rating<>(10));
        service.addRating(movie1, new Rating<>(9));

        service.addRating(movie2, new Rating<>(7));
        service.addRating(movie2, new Rating<>(8));

        List<Movie> movies = service.getMoviesSortedByRating();

        assertEquals(movie1, movies.get(0));
        assertEquals(movie2, movies.get(1));
    }

    @Test
    void averageRatingsMapTest() {

        service.addRating(movie1, new Rating<>(10));
        service.addRating(movie1, new Rating<>(8));

        service.addRating(movie2, new Rating<>(6));
        service.addRating(movie2, new Rating<>(8));

        assertEquals(9.0, service.getAverageRatings().get(movie1));
        assertEquals(7.0, service.getAverageRatings().get(movie2));
    }
}
package complex_tests;

import complex_tasks.task4.Movie;
import complex_tasks.task4.MovieService;
import complex_tasks.task4.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

    @Test
    void concurrentAddRatingAndReadAverageTest() throws InterruptedException {
        int threads = 10;
        int perThread = 20;
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            pool.submit(() -> {
                try {
                    start.await();
                    for (int j = 0; j < perThread; j++) {
                        service.addRating(movie1, new Rating<>(8));
                        service.getAverageRating(movie1);
                        service.getAverageRatings();
                        service.getMoviesSortedByRating();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }
        start.countDown();
        assertTrue(done.await(10, TimeUnit.SECONDS));
        pool.shutdown();
        assertEquals(8.0, service.getAverageRating(movie1));
    }
}
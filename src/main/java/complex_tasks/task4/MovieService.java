package complex_tasks.task4;

import java.util.*;
import java.util.stream.Collectors;



public class MovieService<T extends Number> {
    private final  Map<Movie, List<Rating<T>>> service = new HashMap<>();
    public synchronized void addRating(Movie movie,Rating<T> rating) {
        double value = rating.getValue().doubleValue();
        if (value < 1 || value > 10){
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 1 до 10");
        }
        service.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
    }
    //средняя оценка по фильму

    /**
     * Средняя оценка фильма.
     */
    public double getAverageRating(Movie movie) {
        return service.getOrDefault(movie, List.of())
                .stream()
                .mapToDouble(Rating::doubleValue)
                .average()
                .orElse(0.0);
    }

    /**
     * Карта фильм -> средняя оценка.
     */
    public Map<Movie, Double> getAverageRatings() {
        return service.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue()
                                .stream()
                                .mapToDouble(Rating::doubleValue)
                                .average()
                                .orElse(0.0)
                ));
    }

    /**
     * Сортировка фильмов по средней оценке (по убыванию).
     */
    public List<Movie> getMoviesSortedByRating() {
        return service.keySet()
                .stream()
                .sorted(Comparator.comparingDouble(this::getAverageRating)
                        .reversed())
                .collect(Collectors.toList());
    }
}
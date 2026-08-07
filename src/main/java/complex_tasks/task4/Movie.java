package complex_tasks.task4;

import java.util.Objects;

/*Описание:

Разработайте систему, которая позволяет пользователям ставить оценки фильмам и управлять этими оценками. Система должна поддерживать использование различных типов рейтингов, таких как целые числа или дробные значения, и предоставлять функциональность для расчёта средней оценки фильма, а также для сортировки фильмов по популярности.

Функциональные требования:


Классы и интерфейсы:
Movie: Класс, представляющий фильм с полями для названия и других характеристик.
Rating<T extends Number>: Класс для хранения рейтинга фильма. T может быть Integer, Double и т.д.
MovieService: Сервис для управления фильмами и их рейтингами.
Управление рейтингами:
Хранение оценок в Map<Movie, List<Rating>>.
Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на допустимость (например, оценка должна быть в пределах от 1 до 10).
Возможность расчета средней оценки для каждого фильма.
Обработка данных:
Использование Stream API для подсчёта средней оценки.
Использование Stream API и лямбда-выражений для сортировки фильмов по средней оценке.*/
public class Movie {
    private String movieTitle;
    public Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieName() {
        return movieTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieTitle, movie.movieTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(movieTitle);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                '}';
    }
}

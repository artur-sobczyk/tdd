package pl.sda.tdd.film;

import java.time.LocalDate;
import java.util.Set;

public interface FilmRepository {

    Set<FilmEntity> filmsWithAttribute(String attribute);

    Set<FilmEntity> filmsAllFilmsSince(LocalDate releaseDate);
}

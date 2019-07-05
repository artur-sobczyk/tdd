package pl.sda.tdd.film;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

@Data
@Builder
public class FilmEntity {

    /**
     * Domyślny tytuł filmu w języku angielskim
     */
    private String defaultTitle;

    /**
     * Dostępne tłumaczenia tytułu.
     */
    private Map<String, String> titleInLanguages;

    /**
     * otwarty zbiór atrybutów. np 2d, 3d, imax, comedy, horror
     */
    private Set<String> attributes;

    /**
     * dzień premiery
     */
    private LocalDate releaseDate;
}

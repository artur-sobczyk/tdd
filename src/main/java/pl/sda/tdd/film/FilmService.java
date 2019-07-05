package pl.sda.tdd.film;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FilmService {

    private static final Comparator<FilmDTO> BY_TITLE =
            Comparator.comparing(FilmDTO::getTitle);

    private static final Comparator<FilmDTO> BY_RELEASE_DATE_INVERTED =
            Comparator.comparing(FilmDTO::getReleaseDate).reversed();

    private FilmRepository filmRepository;

    private FilmMapper filmMapper;

    public FilmService(FilmRepository filmRepository, FilmMapper filmMapper) {
        this.filmRepository = filmRepository;
        this.filmMapper = filmMapper;
    }
    public SortedSet<FilmDTO> filmsWithAttributeSortedByTitle(String attribute, String languageCode) {

        Set<FilmEntity> entities = filmRepository.filmsWithAttribute(attribute);
        return entities.stream()
                .map(e -> filmMapper.map(e, languageCode))
                .collect(Collectors.toCollection(() -> new TreeSet<>(BY_TITLE)));

    }

    public SortedSet<FilmDTO> filmsAllFilmsSinceSortedByDate(LocalDate releaseDate, String languageCode) {
        Set<FilmEntity> entities = filmRepository.filmsAllFilmsSince(releaseDate);
        return entities.stream()
                .map(e -> filmMapper.map(e, languageCode))
                .collect(Collectors.toCollection(() -> new TreeSet<>(BY_RELEASE_DATE_INVERTED)));
    }
}

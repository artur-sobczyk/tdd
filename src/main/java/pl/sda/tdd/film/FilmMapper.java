package pl.sda.tdd.film;

import com.google.common.base.Preconditions;

public class FilmMapper {

    public FilmDTO map(FilmEntity film, String languageCode) {
        Preconditions.checkArgument(film != null, "film can't be null");

        FilmDTO.FilmDTOBuilder builder = FilmDTO.builder()
                .releaseDate(film.getReleaseDate())
                .attributes(film.getAttributes());

        if (languageCode != null && film.getTitleInLanguages().keySet().contains(languageCode)) {
            builder.title(film.getTitleInLanguages().get(languageCode));
        } else {
            builder.title(film.getDefaultTitle());
        }
        return builder.build();
    }
}

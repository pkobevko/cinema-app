package app.cinema.service;

import app.cinema.model.Movie;
import java.util.List;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}

package app.cinema.service.impl;

import app.cinema.dao.MovieDao;
import app.cinema.model.Movie;
import app.cinema.service.MovieService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get movie by id " + id));
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}

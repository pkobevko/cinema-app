package app.cinema.dao.impl;

import app.cinema.dao.AbstractDao;
import app.cinema.dao.MovieDao;
import app.cinema.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}

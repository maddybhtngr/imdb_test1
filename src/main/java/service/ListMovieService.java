package service;

import accessor.MovieAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import model.Movie;
import model.Preferences;

import java.util.List;

public class ListMovieService {

    public List<Movie> listMovieService(Preferences preferences) throws JsonProcessingException {
        return new MovieAccessor().getMovies(preferences);
    }
}

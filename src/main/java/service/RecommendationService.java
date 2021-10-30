package service;

import accessor.MovieAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import model.Movie;
import model.User;

import java.util.List;

public class RecommendationService {

    public List<Movie> getRecommendedMovies(User user) throws JsonProcessingException {
        return new MovieAccessor().getMovies(user);
    }
}

package activity;

import com.fasterxml.jackson.core.JsonProcessingException;
import model.Movie;
import model.User;
import service.RecommendationService;

import java.util.List;

public class RecommendedMoviesActivity {

    public List<Movie> getRecommendations(User user) throws JsonProcessingException {
        return new RecommendationService().getRecommendedMovies(user);
    }
}

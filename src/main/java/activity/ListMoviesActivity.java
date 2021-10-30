package activity;

import com.fasterxml.jackson.core.JsonProcessingException;
import model.Movie;
import model.Preferences;
import service.ListMovieService;

import java.util.List;

public class ListMoviesActivity {

    public List<Movie> listMovies(Preferences preferences) throws JsonProcessingException {
        return new ListMovieService().listMovieService(preferences);
    }
}

package accessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import enumList.AgeGroups;
import enumList.Categories;
import model.Movie;
import model.Preferences;
import model.User;
import module.MovieAccessModule;

import java.util.ArrayList;
import java.util.List;

public class MovieAccessor {

    public List<Movie> getMovies(Preferences preferences) throws JsonProcessingException {

        AgeGroups age = preferences.getAgeGroup();
        List<Categories> categories = preferences.getCategories();
        List<String> language = preferences.getLanguages();
        String rating = preferences.getRating();

        return new MovieAccessModule().getMovies(age, categories, language, rating);
    }

    public List<Movie> getMovies(User user) throws JsonProcessingException {

        String location = user.getLocation();
        List<Movie> preferredMovies = new ArrayList<>();
        for (Preferences preferences : user.getPreferences()) {
            preferredMovies.addAll(getMovies(preferences));
        }
        List<Movie> locationBasedMovies = new MovieAccessModule().getMovies(location);
        preferredMovies.addAll(locationBasedMovies);
        return preferredMovies;
    }
}

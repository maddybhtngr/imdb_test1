package module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import enumList.AgeGroups;
import enumList.Categories;
import model.Movie;
import constants.Constants;


import java.util.ArrayList;
import java.util.List;

public class MovieAccessModule {

    ObjectMapper mapper;

    public List<Movie> getMovies(AgeGroups age, List<Categories> categories, List<String> languages, String rating) throws JsonProcessingException {
        mapper = new ObjectMapper();
        List<Movie> fetchedMovies = new ArrayList<>();
        var list = mapper.readValue(Constants.MovieString, List.class);
        for (Object item : list) {
            Movie movieItem = (Movie) item;
            if (movieItem.getRating().equals(rating) || movieItem.getAgeGroups().equals(age) || movieItem.getCategories().contains(categories)) {
                fetchedMovies.add(movieItem);
            }
         }
        return fetchedMovies;
    }

    public List<Movie> getMovies(String location) throws JsonProcessingException {
        mapper = new ObjectMapper();
        List<Movie> fetchedMovies = new ArrayList<>();
        var list = mapper.readValue(Constants.MovieString, List.class);
        for (Object item : list) {
            Movie movieItem = (Movie) item;
            if (movieItem.getLocation().equals(location)) {
                fetchedMovies.add(movieItem);
            }
        }
        return fetchedMovies;
    }
}

package model;

import enumList.AgeGroups;
import enumList.Categories;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
public class Movie {

    String title;

    String rating;

    String url;

    String thumbnail;

    Map<String, String> cast;

    AgeGroups ageGroups;

    List<Categories> categories;

    String location;
}

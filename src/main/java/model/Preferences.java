package model;

import enumList.AgeGroups;
import enumList.Categories;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Preferences {

    List<String> languages;

    AgeGroups ageGroup;

    List<Categories> categories;

    String rating;
}

package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
public class User {

    String username;

    List<Preferences> preferences;

    String location;
}

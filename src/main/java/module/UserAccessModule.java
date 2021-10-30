package module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Constants;
import model.User;
import model.UserMapping;

import java.util.List;

public class UserAccessModule {
    ObjectMapper mapper;

    public User findUser(long token) throws JsonProcessingException {
        mapper = new ObjectMapper();
        var list = mapper.readValue(Constants.UserString, List.class);
        for (Object item : list) {
            UserMapping userMap = (UserMapping) item;
            if (userMap.getToken() == token) {
                return userMap.getUser();
            }
        }
        throw new IllegalAccessError("User not found");
    }
}

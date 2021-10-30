package accessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import model.User;
import module.UserAccessModule;

public class UserAccessor {

    public User getUser(long token) throws JsonProcessingException {
        return new UserAccessModule().findUser(token);
    }
}

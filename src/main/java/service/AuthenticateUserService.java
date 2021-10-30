package service;

import accessor.UserAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import model.Request;
import model.User;

public class AuthenticateUserService {

    private static User user;

    public static boolean isUserAuthenticated() {
        return user == null;
    }

    public static void deRegisterUser() {
        user = null;
    }

    public static User authenticate(Request request) throws JsonProcessingException {

        String token = request.getUsername() + request.getPassword();
        long hashedToken = token.hashCode();
        user = new UserAccessor().getUser(hashedToken);
        return user;
    }

    public static User getUser() {
        return user;
    }
}

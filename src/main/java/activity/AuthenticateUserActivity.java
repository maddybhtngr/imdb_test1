package activity;


import com.fasterxml.jackson.core.JsonProcessingException;
import model.Request;
import model.User;
import service.AuthenticateUserService;

public class AuthenticateUserActivity {

    public User authenticateUser(Request request) throws JsonProcessingException {
        if (AuthenticateUserService.isUserAuthenticated()) {
            return AuthenticateUserService.authenticate(request);
        } else {
            return AuthenticateUserService.getUser();
        }
    }

    public void unAuthenticateUser() {
        AuthenticateUserService.deRegisterUser();
    }
}

package app.cinema.service;

import app.cinema.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}

package app.cinema.service;

import app.cinema.model.MovieSession;
import app.cinema.model.ShoppingCart;
import app.cinema.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}

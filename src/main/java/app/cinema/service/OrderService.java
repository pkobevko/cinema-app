package app.cinema.service;

import app.cinema.model.Order;
import app.cinema.model.ShoppingCart;
import app.cinema.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

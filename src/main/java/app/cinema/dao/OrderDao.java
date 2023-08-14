package app.cinema.dao;

import app.cinema.model.Order;
import app.cinema.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}

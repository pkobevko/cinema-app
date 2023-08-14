package app.cinema.dao.impl;

import app.cinema.dao.AbstractDao;
import app.cinema.dao.TicketDao;
import app.cinema.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}

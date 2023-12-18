package com.tickets.ticketssystem.repositories;
import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.models.TicketReplies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAll();
    Ticket getById(int id);
}
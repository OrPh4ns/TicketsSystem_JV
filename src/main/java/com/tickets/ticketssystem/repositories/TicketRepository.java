package com.tickets.ticketssystem.repositories;
import com.tickets.ticketssystem.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    @Override
    List<Ticket> findAll();
    Ticket getById(int id);
    void deleteById(Long id);
}
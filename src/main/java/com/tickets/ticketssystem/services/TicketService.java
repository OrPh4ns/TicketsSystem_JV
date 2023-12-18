package com.tickets.ticketssystem.services;

import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.models.TicketReplies;
import com.tickets.ticketssystem.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    /**
     * @param id
     * @return ticket
     */
    public List<Ticket> getById(int id)
    {
        return ticketRepository.getById(id);
    }


    public Optional<Ticket> findById(Long id)
    {
        return ticketRepository.findById(id);
    }

    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void deleteById(Long id) {
        ticketRepository.deleteById(id);
    }

}
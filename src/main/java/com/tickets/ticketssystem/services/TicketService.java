package com.tickets.ticketssystem.services;

import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public Ticket getById(int id) {
        return ticketRepository.getById(id);
    }

    public String create(Ticket ticket) {
//        ticketRepository.create(ticket);
        return "Success created";
    }

    public boolean deleteById(Long id) {
        ticketRepository.deleteById(id);
        return true;
    }

}
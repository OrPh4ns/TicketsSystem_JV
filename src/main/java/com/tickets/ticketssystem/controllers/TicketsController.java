package com.tickets.ticketssystem.controllers;
import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TicketsController
{

    @Autowired()
    TicketService ticketService;

    /**
     */
    @GetMapping("/")
    public List<Ticket> getAllTickets()
    {
        return ticketService.findAll();
    }

    @GetMapping("/ticket/{id}")
    public Ticket getTicketById(@PathVariable int id) {
        return ticketService.getById(id);
    }
}

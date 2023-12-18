package com.tickets.ticketssystem.controllers;
import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.repositories.TicketRepository;
import com.tickets.ticketssystem.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketsController
{
    @Autowired()
    TicketService ticketService;
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("")
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    @GetMapping("{id}")
    public Ticket getTicketById(@PathVariable int id) {
        return ticketService.getById(id);
    }

    @PostMapping("create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
        //return ticketService.save(ticket);
    }

    @GetMapping("delete/{id}")
    public boolean deleteById(@PathVariable Long id)
    {
        return ticketService.deleteById(id);
    }



}

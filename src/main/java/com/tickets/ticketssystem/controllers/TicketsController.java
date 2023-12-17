package com.tickets.ticketssystem.controllers;
import com.tickets.ticketssystem.models.Ticket;
import com.tickets.ticketssystem.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketsController
{

    @Autowired()
    TicketService ticketService;
    @GetMapping("/o")
    public String show()
    {
        return "first test";
    }

    @GetMapping("/")
    public List<Ticket> getAllUsers() {
        return ticketService.findAll();
    }
}

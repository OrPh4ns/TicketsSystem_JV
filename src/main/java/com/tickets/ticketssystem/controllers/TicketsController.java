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

    /**
     * @return
     */
    @GetMapping("")
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Ticket getTicketById(@PathVariable int id) {
        return ticketService.getById(id);
    }

    /**
     * @param ticket
     * @return
     */
    @PostMapping("create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    /**
     * @param id
     * @param ticket
     * @return
     */
    @PostMapping("update/{id}")
    public boolean updateTicket(@PathVariable int id, @RequestBody Ticket ticket)
    {
        Ticket optionalTicket = ticketRepository.getById(id);
        optionalTicket.setTitle(ticket.getTitle());
        optionalTicket.setText(ticket.getText());
        ticketRepository.saveAndFlush(optionalTicket);
       return true;
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("delete/{id}")
    public boolean deleteById(@PathVariable Long id)
    {
        return ticketService.deleteById(id);
    }
}

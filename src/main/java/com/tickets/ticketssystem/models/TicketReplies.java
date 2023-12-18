package com.tickets.ticketssystem.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ticket_replies")
@Data
public class TicketReplies
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "ticket", nullable = false)
    private Ticket ticket;
}

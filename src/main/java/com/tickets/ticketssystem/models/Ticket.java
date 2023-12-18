package com.tickets.ticketssystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<TicketReplies> replies;

}
package com.example.lab7_salvador_anais_20202152.entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;
@Entity
@Table(name = "ticket")
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketID", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site siteID;

    @ManyToOne
    @JoinColumn(name = "TechnicianID")
    private Technician technicianID;

    @Size(max = 50)
    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "OpenedDate")
    private Instant openedDate;

    @Column(name = "ClosedDate")
    private Instant closedDate;

}

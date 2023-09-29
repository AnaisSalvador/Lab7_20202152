package com.example.lab7_salvador_anais_20202152.repository;
import com.example.lab7_salvador_anais_20202152.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}

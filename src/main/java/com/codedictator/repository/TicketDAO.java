package com.codedictator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codedictator.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Long> {

}

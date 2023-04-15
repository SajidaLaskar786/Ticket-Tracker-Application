package com.gl.ticket.tickettrackerapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.ticket.tickettrackerapplication.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	@Query("select t from Ticket t where t.title=?1")
	public Ticket searchTicketByTitle(String title);
	
	@Query("select d from Ticket d where d.ticketDescription=?1")
	public Ticket searchTicketByTicketDescription(String ticketDescription);
}

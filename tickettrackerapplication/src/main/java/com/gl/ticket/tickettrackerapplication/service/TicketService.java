package com.gl.ticket.tickettrackerapplication.service;

import java.util.List;

import com.gl.ticket.tickettrackerapplication.entity.Ticket;

public interface TicketService {

	public List<Ticket> findAll();
	public Ticket findById(int id);
	public void save(Ticket ticket);
	public void deleteById(int id);
	public Ticket searchTicketByTitle(String title);
	public Ticket searchTicketByTicketDescription(String ticketDescription);
}

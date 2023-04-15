package com.gl.ticket.tickettrackerapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.ticket.tickettrackerapplication.entity.Ticket;
import com.gl.ticket.tickettrackerapplication.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public List<Ticket> findAll() {
		List<Ticket> tickets=ticketRepository.findAll();
		return tickets;
	}

	@Override
	public Ticket findById(int id) {
		Optional<Ticket> ticket=ticketRepository.findById(id);
		return ticket.get();
	}

	@Override
	public void save(Ticket ticket) {
		ticketRepository.save(ticket);
		
	}

	@Override
	public void deleteById(int id) {
		ticketRepository.deleteById(id);
		
	}

	@Override
	public Ticket searchTicketByTitle(String title) {
		Ticket ticket=ticketRepository.searchTicketByTitle(title);
		return ticket;
	}

	@Override
	public Ticket searchTicketByTicketDescription(String ticketDescription) {
		Ticket ticket=ticketRepository.searchTicketByTicketDescription(ticketDescription);
		return ticket;
	}
	
	
	

}

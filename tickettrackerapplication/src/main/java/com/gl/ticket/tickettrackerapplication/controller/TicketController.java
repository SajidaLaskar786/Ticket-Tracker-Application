package com.gl.ticket.tickettrackerapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.ticket.tickettrackerapplication.entity.Ticket;
import com.gl.ticket.tickettrackerapplication.service.TicketService;

@Controller
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketService ticketService;
	
	@RequestMapping("/list")
	public String getAllTickets(Model model) {
		List<Ticket> tickets=ticketService.findAll();
		model.addAttribute("tickets",tickets);
		return "ticketlist";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Ticket ticket=new Ticket();
		model.addAttribute("ticket",ticket);
		return "ticketform";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id,Model model) {
		Ticket ticket=ticketService.findById(id);
		model.addAttribute("ticket",ticket);
		return "ticketform";
	}
	
	@RequestMapping("/save")
	public String saveTicket(@RequestParam("id") int id, @RequestParam("title") String title,
			@RequestParam("ticketDescription") String ticketDescription, @RequestParam("ticketCreatedDate") String ticketCreatedDate) {
		Ticket ticket;
		if(id!=0) {
			ticket=ticketService.findById(id);
			ticket.setTitle(title);
			ticket.setTicketDescription(ticketDescription);
			ticket.setTicketCreatedDate(ticketCreatedDate);
			
		}
		else {
			ticket=new Ticket(title,ticketDescription,ticketCreatedDate);
		}
		ticketService.save(ticket);
		return "redirect:/ticket/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		ticketService.deleteById(id);
		return "redirect:/ticket/list";
	}
	
	@RequestMapping("/search")
	public String searchByTitle(@RequestParam("title") String title,Model model) {
		Ticket ticket =ticketService.searchTicketByTitle(title);
		model.addAttribute("ticket",ticket);
		return "searchresult";
	}
	
	
	
	
}

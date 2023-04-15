package com.gl.ticket.tickettrackerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.gl.ticket.tickettrackerapplication.*")
public class TickettrackerapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TickettrackerapplicationApplication.class, args);
		System.out.println("Ticket Tracker Application");
	}

}

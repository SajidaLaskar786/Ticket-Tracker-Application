package com.gl.ticket.tickettrackerapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="ticketDescription")
	private String ticketDescription;
	
	@Column(name="ticketCreatedDate")
	private String ticketCreatedDate;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Ticket(int id, String title, String ticketDescription, String ticketCreatedDate) {
		super();
		this.id = id;
		this.title = title;
		this.ticketDescription = ticketDescription;
		this.ticketCreatedDate = ticketCreatedDate;
	}
	
	public Ticket(String title, String ticketDescription, String ticketCreatedDate) {
		super();
		this.title = title;
		this.ticketDescription = ticketDescription;
		this.ticketCreatedDate = ticketCreatedDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketCreatedDate() {
		return ticketCreatedDate;
	}

	public void setTicketCreatedDate(String ticketCreatedDate) {
		this.ticketCreatedDate = ticketCreatedDate;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", title=" + title + ", ticketDescription=" + ticketDescription
				+ ", ticketCreatedDate=" + ticketCreatedDate + "]";
	}

	
	
}

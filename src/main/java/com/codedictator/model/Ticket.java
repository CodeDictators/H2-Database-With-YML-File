package com.codedictator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "ticket_counter")
@Api(value = "Ticket Entity", description = "This will store ticket info")
public class Ticket {
	@Id
	@GeneratedValue
	@ApiModelProperty(notes = "We are setting Primary Id of Ticket")
	@Column(name = "ticket_id")
	private Long ticketId;
	@Column(name = "cost")
	private Double amount;
	@Column(name = "type")
	private String catagory;
	@Column(name = "owner")
	private String createdBy;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}

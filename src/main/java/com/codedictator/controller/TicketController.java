package com.codedictator.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedictator.model.Ticket;
import com.codedictator.repository.TicketDAO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/ticket")
@Api(value = "This is Ticket Controller")
public class TicketController {

	@Autowired
	private TicketDAO dao;

	@ApiOperation(value = "Getting all ticket object")
	@ApiResponses(value = { @ApiResponse(code = 100, message = "100 is the msg"),
			@ApiResponse(code = 200, message = "200 is for Successful") })
	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		// logic to return list of ticket obj
		return dao.findAll();
	}

	@PostMapping("/addTicke")
	public String bookTicket(
			@ApiParam(value = "To take ticket info from user", required = true) @RequestBody Ticket tickets) {
		dao.save(tickets);
		return "Ticket Booked: " + LocalDateTime.now();
	}
}

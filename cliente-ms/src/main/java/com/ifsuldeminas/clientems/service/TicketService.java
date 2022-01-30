package com.ifsuldeminas.clientems.service;

import com.ifsuldeminas.clientems.model.TicketDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface TicketService {
    @GetMapping(value = "/ticket/ticketId/{ticketId}")
    TicketDTO findByTicketId(@PathVariable("ticketId") Integer ticketId);
}

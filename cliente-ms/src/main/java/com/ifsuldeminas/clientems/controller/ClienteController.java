package com.ifsuldeminas.clientems.controller;

import com.ifsuldeminas.clientems.model.ClienteDTO;
import com.ifsuldeminas.clientems.repository.ClienteRepository;
import com.ifsuldeminas.clientems.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    TicketService ticketService;

    //getAll
    @GetMapping(value = "/cliente")
    public Iterable<ClienteDTO> findAll() {
        return clienteRepository.findAll();
    }

    //get por numeroPremiado
    @GetMapping(value = "/cliente/{ticketId}")
    public ClienteDTO findByTicketId(@PathVariable Integer ticketId) {
        ClienteDTO cliente = clienteRepository.findByTicketId(ticketId);
        cliente.setTicket(ticketService.findByTicketId(ticketId));
        return cliente;
    }
}

package com.ifsuldeminas.clientems.controller;

import com.ifsuldeminas.clientems.model.ClienteDTO;
import com.ifsuldeminas.clientems.repository.ClienteRepository;
import com.ifsuldeminas.clientems.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    TicketService ticketService;

    //getAll
    @GetMapping(value = "/cliente")
    public List<ClienteDTO> findAllClientes() {
        List<ClienteDTO> clientes = clienteRepository.findAll();
        for (ClienteDTO cliente: clientes) {
            cliente.setTicket(ticketService.findByTicketId(cliente.getTicketId()));
        }
        return clientes;
    }

    //getByTicketId
    @GetMapping(value = "/cliente/{ticketId}")
    public ClienteDTO findByTicketId(@PathVariable Integer ticketId) {
        ClienteDTO cliente = clienteRepository.findByTicketId(ticketId);
        cliente.setTicket(ticketService.findByTicketId(ticketId));
        return cliente;
    }
}

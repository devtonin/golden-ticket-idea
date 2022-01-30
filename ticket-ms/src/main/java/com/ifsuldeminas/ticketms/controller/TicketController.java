package com.ifsuldeminas.ticketms.controller;

import com.ifsuldeminas.ticketms.model.TicketDTO;
import com.ifsuldeminas.ticketms.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping(value = "/ticket")
    public Iterable<TicketDTO> findAll() {
        return ticketRepository.findAll();
    }

    @RequestMapping(value = "/ticket/{numeroPremiado}", method = RequestMethod.GET)
    public TicketDTO findByNumeroPremiado (@PathVariable Integer numeroPremiado) {
        return ticketRepository.findTicketByNumeroPremiado(numeroPremiado);
    }

    @RequestMapping(value = "/ticket/ticketId/{ticketId}", method = RequestMethod.GET)
    public TicketDTO findByTicketId (@PathVariable Integer ticketId) {
        return ticketRepository.findByTicketId(ticketId);
    }

    @GetMapping(value = "/ticket/produto/{produtoId}")
    public TicketDTO findByProdutoId (@PathVariable Integer produtoId) {
        return ticketRepository.findAllByProdutoId(produtoId);
    }
}

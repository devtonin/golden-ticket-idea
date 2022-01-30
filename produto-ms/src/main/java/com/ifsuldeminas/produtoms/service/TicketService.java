package com.ifsuldeminas.produtoms.service;

import com.ifsuldeminas.produtoms.model.ProdutoDTO;
import com.ifsuldeminas.produtoms.model.TicketDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface TicketService {
    @GetMapping(value = "/ticket/produto/{produtoId}")
    TicketDTO findByProdutoId (@PathVariable("produtoId") Integer produtoId);

    @PostMapping(value = "/ticket")
    TicketDTO saveTicket (TicketDTO ticket);
}

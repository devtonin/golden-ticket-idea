package com.ifsuldeminas.produtoms.service;

import com.ifsuldeminas.produtoms.model.TicketDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface TicketService {

    @GetMapping(value = "/ticket/produto/{produtoId}")
    TicketDTO findByProdutoId (@PathVariable("produtoId") Integer produtoId);
}

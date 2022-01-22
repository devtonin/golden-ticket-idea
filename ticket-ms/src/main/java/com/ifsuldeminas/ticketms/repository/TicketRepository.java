package com.ifsuldeminas.ticketms.repository;

import com.ifsuldeminas.ticketms.model.TicketDTO;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<TicketDTO, Integer> {
    TicketDTO findTicketByNumeroPremiado(Integer numeroPremiado);
    TicketDTO findAllByProdutoId(Integer produtoId);
}

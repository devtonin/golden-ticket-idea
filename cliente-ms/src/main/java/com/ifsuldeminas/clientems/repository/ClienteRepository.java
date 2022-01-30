package com.ifsuldeminas.clientems.repository;

import com.ifsuldeminas.clientems.model.ClienteDTO;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteDTO, Integer> {
    ClienteDTO findByTicketId(Integer ticketId);
}

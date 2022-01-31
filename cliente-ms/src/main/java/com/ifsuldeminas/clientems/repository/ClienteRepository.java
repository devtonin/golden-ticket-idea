package com.ifsuldeminas.clientems.repository;

import com.ifsuldeminas.clientems.model.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends JpaRepository<ClienteDTO, Integer> {
    ClienteDTO findByTicketId(Integer ticketId);
}

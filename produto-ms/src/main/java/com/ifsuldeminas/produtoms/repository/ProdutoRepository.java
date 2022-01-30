package com.ifsuldeminas.produtoms.repository;

import com.ifsuldeminas.produtoms.model.ProdutoDTO;
import com.ifsuldeminas.produtoms.model.TicketDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoDTO, Integer> {
    ProdutoDTO findByProdutoId(Integer produtoId);
}

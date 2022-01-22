package com.ifsuldeminas.produtoms.repository;

import com.ifsuldeminas.produtoms.model.ProdutoDTO;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoDTO, Integer> {
    ProdutoDTO findByProdutoId(Integer produtoId);
}

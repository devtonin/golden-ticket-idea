package com.ifsuldeminas.produtoms.controller;

import com.ifsuldeminas.produtoms.model.ProdutoDTO;
import com.ifsuldeminas.produtoms.model.TicketDTO;
import com.ifsuldeminas.produtoms.repository.ProdutoRepository;
import com.ifsuldeminas.produtoms.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//CRUD dos requisitos do trabalho
@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    TicketService ticketService;

    //getAll
    @GetMapping(value = "/produto")
    public List<ProdutoDTO> findAllProdutos() {
       List<ProdutoDTO> produtos = produtoRepository.findAll();
        for (ProdutoDTO produto : produtos) {
            produto.setTicket(ticketService.findByProdutoId(produto.getProdutoId()));
        }
       return produtos;
    }

    //get por produtoId
    @GetMapping(value = "/produto/{produtoId}")
    public ProdutoDTO findByProdutoId (@PathVariable Integer produtoId) {
        ProdutoDTO produto = produtoRepository.findByProdutoId(produtoId);
        produto.setTicket(ticketService.findByProdutoId(produtoId));
        return produto;
    }

    //post
    @RequestMapping(value = "/produto", method =  RequestMethod.POST)
    public ProdutoDTO cadastraProduto(@Valid @RequestBody ProdutoDTO produto) {
        produto.getTicket().setProdutoId(produto.getProdutoId());
        ticketService.saveTicket(produto.getTicket());
        produtoRepository.save(produto);
        return produto;
    }

    //update
    @RequestMapping(value = "/produto/{produtoId}", method = RequestMethod.PUT)
    public ResponseEntity<ProdutoDTO> atualizaProduto(@PathVariable(value = "produtoId") Integer produtoId, @Valid @RequestBody ProdutoDTO produtoNovo) {

        Optional<ProdutoDTO> produtoAntigo = Optional.ofNullable(produtoRepository.findByProdutoId(produtoId));

        if (produtoAntigo.isPresent()) {
            ProdutoDTO produto = produtoAntigo.get();
            produto.setProdutoName(produtoNovo.getProdutoName());
            produtoRepository.save(produto);
            return new ResponseEntity<ProdutoDTO>(produto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //delete
    @RequestMapping(value = "/produto/{produtoId}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deletaProduto(@PathVariable(value = "produtoId") Integer produtoId) {

        Optional<ProdutoDTO> produto = Optional.ofNullable(produtoRepository.findByProdutoId(produtoId));

        if (produto.isPresent()) {
            produtoRepository.delete(produto.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

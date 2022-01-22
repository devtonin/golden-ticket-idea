package com.ifsuldeminas.produtoms.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "PRODUTO")
@Entity
public class ProdutoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PRODUTOID")
    Integer produtoId;

    @Column(name = "PRODUTONAME")
    String produtoName;

    @Transient
    TicketDTO ticket;

    public ProdutoDTO() { super(); }

    public ProdutoDTO(Integer produtoId, String produtoName) {
        super();
        this.produtoId = produtoId;
        this.produtoName = produtoName;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoName() {
        return produtoName;
    }

    public void setProdutoName(String produtoName) {
        this.produtoName = produtoName;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public TicketDTO getTicket() {
        return ticket;
    }

    public void setTicket(TicketDTO ticket) {
        this.ticket = ticket;
    }
}

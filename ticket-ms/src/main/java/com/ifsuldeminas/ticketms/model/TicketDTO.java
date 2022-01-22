package com.ifsuldeminas.ticketms.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="TICKETS")
@Entity
public class TicketDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="TICKETID")
    Integer ticketId;

    @Column(name="NUMEROPREMIADO")
    Integer numeroPremiado;

    @Column(name="STATUS")
    String status;

    @Column(name="PRODUTOID")
    Integer produtoId;

    public TicketDTO() { super(); }

    public TicketDTO(Integer ticketId, Integer numeroPremiado, String status, Integer produtoId) {
        super();
        this.ticketId = ticketId;
        this.numeroPremiado = numeroPremiado;
        this.status = status;
        this.produtoId = produtoId;
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "ticketId=" + ticketId +
                ", numeroPremiado=" + numeroPremiado +
                ", status='" + status + '\'' +
                ", produtoId=" + produtoId +
                '}';
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getNumeroPremiado() {
        return numeroPremiado;
    }

    public void setNumeroPremiado(Integer numeroPremiado) {
        this.numeroPremiado = numeroPremiado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }
}

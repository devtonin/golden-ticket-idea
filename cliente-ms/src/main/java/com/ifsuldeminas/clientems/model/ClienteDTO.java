package com.ifsuldeminas.clientems.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "CLIENTE")
@Entity
public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CPF")
    Integer cpf;

    @Column(name = "NOMECLIENTE")
    String nomeCliente;

    @Column(name = "TICKETID")
    Integer ticketId;

    @Transient
    TicketDTO ticket;

    public ClienteDTO() { super(); }

    public ClienteDTO(Integer cpf, String nomeCliente) {
        super();
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
    }
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public TicketDTO getTicket() {
        return ticket;
    }

    public void setTicket(TicketDTO ticket) {
        this.ticket = ticket;
    }
}

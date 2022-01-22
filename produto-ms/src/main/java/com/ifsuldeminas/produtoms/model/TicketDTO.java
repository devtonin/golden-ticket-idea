package com.ifsuldeminas.produtoms.model;

import java.io.Serializable;

public class TicketDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    Integer ticketId;
    Integer numeroPremiado;
    String status;

    public TicketDTO() {
        super();
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

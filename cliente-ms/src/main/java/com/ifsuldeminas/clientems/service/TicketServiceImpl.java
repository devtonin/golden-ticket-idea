package com.ifsuldeminas.clientems.service;

import com.ifsuldeminas.clientems.model.TicketDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultTicket")
    public TicketDTO findByTicketId(Integer ticketId) {
        return restTemplate.getForObject("http://ticket-ms/ticket/ticketId/{ticketId}", TicketDTO.class, ticketId);
    }

    private TicketDTO defaultTicket(Integer cpf) {
        return new TicketDTO();
    }
}

package com.ifsuldeminas.produtoms.service;

import com.ifsuldeminas.produtoms.model.TicketDTO;
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
    public TicketDTO findByProdutoId(Integer produtoId) {
        return restTemplate.getForObject("http://ticket-ms/ticket/produto/{produtoId}", TicketDTO.class, produtoId);
    }

    @HystrixCommand(fallbackMethod = "defaultTicketSave")
    public TicketDTO saveTicket(TicketDTO ticket) {
        return restTemplate.postForObject("http://ticket-ms/ticket", ticket, TicketDTO.class);
    }

    private TicketDTO defaultTicket(Integer produtoId) {
        return new TicketDTO();
    }

    private TicketDTO defaultTicketSave(TicketDTO ticket) {
        return new TicketDTO();
    }
}

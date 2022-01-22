package com.ifsuldeminas.ticketms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketMsApplication {
	public static void main(String[] args) {
		SpringApplication.run(TicketMsApplication.class, args);
	}
}

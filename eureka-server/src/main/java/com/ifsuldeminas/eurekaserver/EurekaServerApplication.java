package com.ifsuldeminas.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	// TODO: 31/01/2022 containerizar cada ms através do k8s - replicar o projeto com comunicação via kafka - implementar uma api gateway 
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}

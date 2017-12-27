package com.pencilcanada.puck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PuckApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuckApplication.class, args);
	}
}

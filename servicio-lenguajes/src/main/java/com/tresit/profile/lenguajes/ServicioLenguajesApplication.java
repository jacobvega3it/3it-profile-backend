package com.tresit.profile.lenguajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServicioLenguajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioLenguajesApplication.class, args);
	}

}

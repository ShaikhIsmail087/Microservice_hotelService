package com.lswd.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.springframework.security.oauth2.jwt")
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}

}

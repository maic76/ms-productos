package com.example.msproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsproductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsproductosApplication.class, args);
	}

}

package com.servfin.servfin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
            "com.servfin.servfin.entidade"
            })
@EnableJpaRepositories(basePackages = {
            "com.servfin.servfin.repository"
            })
public class ServfinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServfinApplication.class, args);
	}
}

package br.com.analiseesportiva.aposta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"br.com.analiseesportiva.controller", "br.com.analiseesportiva.dao", "br.com.analiseesportiva.model"})
@SpringBootApplication
@EntityScan(basePackages = { "br.com.analiseesportiva.model" })
@EnableJpaRepositories(basePackages = { "br.com.analiseesportiva.dao" })
public class ApostaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ApostaApplication.class, args);
	}

}


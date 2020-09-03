package br.com.analiseesportiva.aposta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"br.com.analiseesportiva.controller"})
@SpringBootApplication
public class ApostaApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApostaApplication.class, args);
	}

}

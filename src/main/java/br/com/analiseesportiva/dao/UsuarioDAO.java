package br.com.analiseesportiva.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.analiseesportiva.model.UsuarioModel;

@Repository
@EnableJpaRepositories
public interface UsuarioDAO extends CrudRepository<UsuarioModel,Integer>{

	@Bean
	public UsuarioModel findByEmailAndSenha(String email, String senha); 
}
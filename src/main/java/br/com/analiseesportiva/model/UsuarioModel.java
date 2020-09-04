package br.com.analiseesportiva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name="TB_USUARIOS")
@Entity
public class UsuarioModel {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="email", length=80)
	private String email;
	
	@Column(name="senha", length=20)
	private String senha;
	
	
	
	
	
	public UsuarioModel() {
		super();
	}
	public UsuarioModel(int id, String email, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}

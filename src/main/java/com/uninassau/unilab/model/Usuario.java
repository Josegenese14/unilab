package com.uninassau.unilab.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@GeneratedValue
	private Integer id;
	@Id
	private String matricula;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, length = 20)
	private String email;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String matricula, String nome, String email) {
		
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	
	
	//compara se um usuario é igual ao outro.
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
}

package br.org.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_categoria") // create table tb_postagens
public class Categoria {

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id auto increment 
	private Long id;
	
	@NotBlank(message = "O artributo tipo é obrigatório!")
	@Size(min = 5, max = 100)
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return tipo;
	}

	public void setTitulo(String tipo) {
		this.tipo = tipo;
	}
	
}

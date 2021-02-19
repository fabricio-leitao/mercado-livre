package br.com.zup.mercadolivre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private @NotBlank String nome;
	@ManyToOne
	private Categoria categoria;

	@Deprecated
	public Categoria() {
		
	}
	
	public Categoria(@NotBlank String nome) {
		this.nome = nome;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}

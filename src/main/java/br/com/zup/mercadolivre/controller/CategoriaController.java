package br.com.zup.mercadolivre.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.mercadolivre.controller.request.NovaCategoriaRequest;
import br.com.zup.mercadolivre.model.Categoria;

@RestController
public class CategoriaController {

	@PersistenceContext
	private EntityManager manager;
	
	@PostMapping(value = "/categorias")
	@Transactional
	public void criar(@RequestBody @Valid NovaCategoriaRequest request) {
		Categoria categoria = request.toModel(manager);
		manager.persist(categoria);
	}
}

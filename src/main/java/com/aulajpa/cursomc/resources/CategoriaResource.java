package com.aulajpa.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aulajpa.cursomc.domain.Categoria;
import com.aulajpa.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
//		Categoria cat1 = new Categoria(1, "Informatica");
//		Categoria cat2 = new Categoria(2, "Escritorio");
//		
//		List<Categoria> lista = new ArrayList<Categoria>();
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		return lista;
		
		Categoria categoria = service.buscar(id);
		
		//ResponseEntity<Categoria> responseEntity = new ResponseEntity<Categoria>(categoria, HttpStatus.ACCEPTED);
		return ResponseEntity.ok().body(categoria);
		
		
	}
}

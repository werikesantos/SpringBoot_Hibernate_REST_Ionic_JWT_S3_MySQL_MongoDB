package com.werikesantos.criandoprojetospringboot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.werikesantos.criandoprojetospringboot.dominio.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		//ESSE MÉTODO VAI RETORNAR UMA LISTA NO FORMATO JSON
		Categoria categoria1 = new Categoria(1,"Informática");
		Categoria categoria2 = new Categoria(2,"Escritório");
		
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(categoria1);
		listaCategoria.add(categoria2);
		
		return listaCategoria;
	}
}
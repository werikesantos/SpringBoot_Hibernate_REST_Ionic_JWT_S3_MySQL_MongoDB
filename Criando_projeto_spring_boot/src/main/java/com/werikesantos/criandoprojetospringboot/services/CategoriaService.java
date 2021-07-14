package com.werikesantos.criandoprojetospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.werikesantos.criandoprojetospringboot.dominio.Categoria;
import com.werikesantos.criandoprojetospringboot.repositories.CategoriaRepository;

//CLASSE RESPONSÁVEL POR ATENDER O CONTROLADOR REST, RELACIONANDO OPERAÇÕES DA CLASSE CATEGORIAS

@Service
public class CategoriaService {

	@Autowired //SERVE PARA INSTANCIAR AUTOMATICAMENTE PELO SPRING
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoriaObj = categoriaRepository.findById(id);
		return categoriaObj.orElse(null);//categoriaObj.orElse(null) = RETORNA O OBJETO E SE NÃO ENCONTRAR RETORNA NULL
	}
}
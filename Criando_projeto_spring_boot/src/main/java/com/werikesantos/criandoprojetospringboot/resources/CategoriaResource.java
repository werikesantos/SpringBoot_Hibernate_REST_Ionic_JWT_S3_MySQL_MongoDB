package com.werikesantos.criandoprojetospringboot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.werikesantos.criandoprojetospringboot.dominio.Categoria;
import com.werikesantos.criandoprojetospringboot.services.CategoriaService;

//ESSA CLASSE É UM CONTROLADOR REST FAZ ACESSOS AS CLASSES DE SERVIÇOS(service), QUE POR SUA VEZ, ACESSA ACESSA AS CLASSES DE REPOSITORIES(Repository)

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		//@PathVariable = PEGA O ID DA URL E MANDA PARA O 'id' DA VARIAVEL DO PARAMETRO
		//ResponseEntity<?> = ARMAZENA VARIAS INFORMAÇÕES DE UMA RESPOSTA HTTP PARA SERVIÇO REST
		
		Categoria categoria = categoriaService.buscar(id);
		
		//ResponseEntity = É UM OBJETO COMLEXO QUE RETORNA CODIGOS HTTP DE RESPOSTA E VARIAS INFORMAÇÕES DO PROTOCOLO HTTP
		//ok() =  SERVE PARA INDICAR QUE DEU TUDO CERTO
		//body(categoria) = COMO CORPO DA RESPOSTA EU ENVIO O OBJETO
		
		return ResponseEntity.ok().body(categoria);
	}
}
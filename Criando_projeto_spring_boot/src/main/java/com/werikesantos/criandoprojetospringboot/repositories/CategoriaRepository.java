package com.werikesantos.criandoprojetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.werikesantos.criandoprojetospringboot.dominio.Categoria;

//CLASSE RESPONSÁVEL POR ACESSAR OS DADOS NO BANCO DE DADOS(USANDO O MAPEAMENTO DO JPA)

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	//JpaRepository = Acessa os dados pelo tipo especificado (Categoria), que é classe de dominio
	//Integer é o tipo do identificador do objeto(id)

}
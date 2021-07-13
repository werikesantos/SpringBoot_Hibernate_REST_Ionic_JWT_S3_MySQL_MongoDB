package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------
		
		/* ADICIONANDO
		 
		    //CRIANDO OS OBJETOS
			Pessoa p1 = new Pessoa(null,"Werike", "werike@gmail.com");
			Pessoa p2 = new Pessoa(null,"Marcos", "marcos@gmail.com");
			Pessoa p3 = new Pessoa(null,"Larissa", "larissa@gmail.com");
		
			//INICIALIZANDO A CONEXÃO COM O BANCO
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula_Hibernate_JPA");
			EntityManager em = emf.createEntityManager();
			
			//INICIANDO
			em.getTransaction().begin();
			
			//ENVIANDO OBJETO PARA A TABELA
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			
			//FINALIZADA TRANSAÇÃO
			em.getTransaction().commit();
			
			//FECHANDO CONEXÕES
			em.close();
			emf.close();
		*/

//-----------------------------------------------------------------------------------------------------
		
	/* BUSCANDO POR ID
	 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula_Hibernate_JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//MÉTODO QUE BUSCA POR ID POR PARAMETRO
		Pessoa pessoaId = em.find(Pessoa.class, 8);
		
		System.out.println(pessoaId);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	*/

//---------------------------------------------------------------------------------------------------------

	 /* REMOVENDO DO BANCO DE DADOS
		
		// OBSERVAÇÃO: O JPA SÓ REMOVE SE O OBJETO ESTIVER MONITORADO, OU SEJA, 
		// TEM QUE BUSCAR NO BANCO PRIMEIRAMENTE E DEPOIS EXCLUIR.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula_Hibernate_JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		//PRIMEIRO REALIZANDO A BUSCA
		Pessoa pessoa5 = em.find(Pessoa.class, 5);
		Pessoa pessoa6 = em.find(Pessoa.class, 6);
		Pessoa pessoa7 = em.find(Pessoa.class, 7);
		Pessoa pessoa9 = em.find(Pessoa.class, 9);
		
		//CONFIRMANDO...
		System.out.println(pessoa5);
		System.out.println(pessoa6);
		System.out.println(pessoa7);
		System.out.println(pessoa9);
		
		//EXCLUÍNDO O OBJETO MONITORADO
		em.remove(pessoa5);
		em.remove(pessoa6);
		em.remove(pessoa7);
		em.remove(pessoa9);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	*/
		
	}
}
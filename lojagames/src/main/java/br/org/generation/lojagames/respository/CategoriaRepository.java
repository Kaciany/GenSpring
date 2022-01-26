package br.org.generation.lojagames.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	List<Categoria> findAllByTituloContainingIgnoreCase(String tipo);
	
}

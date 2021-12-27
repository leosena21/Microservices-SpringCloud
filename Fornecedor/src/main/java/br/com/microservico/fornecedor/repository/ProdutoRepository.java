package br.com.microservico.fornecedor.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservico.fornecedor.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, UUID>{
	
	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<UUID> ids);
}

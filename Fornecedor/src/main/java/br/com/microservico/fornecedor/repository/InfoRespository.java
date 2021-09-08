package br.com.microservico.fornecedor.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservico.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRespository extends CrudRepository<InfoFornecedor, UUID>{
	
	InfoFornecedor findByEstado(String estado);

}

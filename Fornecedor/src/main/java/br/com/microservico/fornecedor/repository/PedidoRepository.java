package br.com.microservico.fornecedor.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservico.fornecedor.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, UUID>{
	
}

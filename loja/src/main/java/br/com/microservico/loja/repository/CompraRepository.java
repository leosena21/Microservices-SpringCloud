package br.com.microservico.loja.repository;

import java.util.UUID;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.microservico.loja.model.Compra;
import feign.Param;

public interface CompraRepository extends CrudRepository<Compra, UUID>{


}

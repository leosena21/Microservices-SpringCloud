package br.com.microservico.transportador.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservico.transportador.model.Entrega;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, UUID>{

}

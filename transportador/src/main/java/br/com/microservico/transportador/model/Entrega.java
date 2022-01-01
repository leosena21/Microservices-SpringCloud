package br.com.microservico.transportador.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Entrega {
	
	@Id
	@Type(type="org.hibernate.type.UUIDCharType")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	private UUID pedidoId;
	private LocalDate dataParaBusca;
	private LocalDate previsaoParaEntrega;
	private String enderecoOrigem;
	private String enderecoDestino;

}

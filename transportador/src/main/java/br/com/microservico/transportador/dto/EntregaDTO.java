package br.com.microservico.transportador.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaDTO {

	
	private UUID pedidoId;
	private LocalDate dataParaEntrega;
	private String enderecoOrigem;
	private String enderecoDestino;
}

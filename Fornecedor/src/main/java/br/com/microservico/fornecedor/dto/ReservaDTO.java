package br.com.microservico.fornecedor.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaDTO {

	private UUID idReserva;
	private Integer tempoDePreparo;
}

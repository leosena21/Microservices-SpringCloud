package br.com.microservico.transportador.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherDTO {

	private UUID numero;
	private LocalDate previsaoParaEntrega;
}

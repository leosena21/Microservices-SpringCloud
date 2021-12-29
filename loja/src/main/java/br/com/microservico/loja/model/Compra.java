package br.com.microservico.loja.model;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Compra {
	private UUID pedidoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;
}

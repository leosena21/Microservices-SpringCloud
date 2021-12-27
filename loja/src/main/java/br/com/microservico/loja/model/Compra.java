package br.com.microservico.loja.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compra {
	private UUID pedidoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;
}

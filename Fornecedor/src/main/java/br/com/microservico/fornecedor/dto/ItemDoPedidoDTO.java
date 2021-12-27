package br.com.microservico.fornecedor.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDoPedidoDTO {

	private UUID id;
	private Integer quantidade;
}

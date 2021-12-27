package br.com.microservico.loja.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoPedidoDTO {
	
	private UUID id;
	private Integer tempoDePreparo;

}

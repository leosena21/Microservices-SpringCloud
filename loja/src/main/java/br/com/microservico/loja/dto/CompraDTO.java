package br.com.microservico.loja.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {
	
	private List<ItemDTO> itens;
	private EnderecoDTO endereco;
}

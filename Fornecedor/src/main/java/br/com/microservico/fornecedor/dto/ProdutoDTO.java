package br.com.microservico.fornecedor.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {

	private String nome;	
	private String estado;
	private String descricao;
	private BigDecimal preco;
}

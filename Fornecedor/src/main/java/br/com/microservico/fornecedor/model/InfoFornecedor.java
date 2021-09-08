package br.com.microservico.fornecedor.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoFornecedor {
	
	@Id
	@Column(name = "id", columnDefinition = "BINARY(16)")
	@GeneratedValue
	private UUID id;
	
	private String nome;
	
	private String estado;
	
	private String endereco;
	
	

}

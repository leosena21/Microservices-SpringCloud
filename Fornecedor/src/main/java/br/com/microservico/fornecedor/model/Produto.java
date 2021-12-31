package br.com.microservico.fornecedor.model;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
	
	@Id
	@GeneratedValue
	@Type(type="org.hibernate.type.UUIDCharType")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	private String nome;	
	private String estado;
	private String descricao;
	private BigDecimal preco;
}

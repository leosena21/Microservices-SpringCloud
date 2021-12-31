package br.com.microservico.fornecedor.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PedidoItem {
	
	@Id
	@GeneratedValue
	@Type(type="org.hibernate.type.UUIDCharType")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="produtoId")
	private Produto produto;

}

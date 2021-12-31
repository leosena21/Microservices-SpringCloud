package br.com.microservico.loja.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Compra {
	@Id
	@Type(type="org.hibernate.type.UUIDCharType")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID pedidoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;
}

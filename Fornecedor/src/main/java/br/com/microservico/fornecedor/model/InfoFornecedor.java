package br.com.microservico.fornecedor.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoFornecedor {
	
	@Id
	@GeneratedValue
	@Type(type="org.hibernate.type.UUIDCharType")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	private String nome;
	
	private String estado;
	
	private String endereco;
	
	

}

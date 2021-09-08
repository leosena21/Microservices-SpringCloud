package br.com.microservico.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.microservico.loja.dto.CompraDTO;
import br.com.microservico.loja.dto.InfoFornecedorDTO;

public class CompraService {

	public void ralizaCompra(CompraDTO compra) {
		
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				"http://localhost:8081/info/"+compra.getEndereco().getEstado(), 
				HttpMethod.GET, null, 
				InfoFornecedorDTO.class
		);

	}

}

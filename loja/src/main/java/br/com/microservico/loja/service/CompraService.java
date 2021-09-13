package br.com.microservico.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservico.loja.dto.CompraDTO;
import br.com.microservico.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate client;
	
	@Autowired
	private DiscoveryClient eurekaClient;

	public void ralizaCompra(CompraDTO compra) {
		
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				"http://fornecedor/info/"+compra.getEndereco().getEstado(), 
				HttpMethod.GET, null, 
				InfoFornecedorDTO.class
		);
		
		eurekaClient.getInstances("fornecedor").stream()
		.forEach(fornecedor -> {
			System.out.println("localhost:"+fornecedor.getPort());

		});
		
		System.out.println(exchange.getBody().getEndereco());

	}

}

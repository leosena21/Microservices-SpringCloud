package br.com.microservico.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservico.loja.client.FornecedorClient;
import br.com.microservico.loja.dto.CompraDTO;
import br.com.microservico.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public void ralizaCompra(CompraDTO compra) {
		
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		
		System.out.println(info.getEndereco());
	}

}

package br.com.microservico.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservico.fornecedor.model.InfoFornecedor;
import br.com.microservico.fornecedor.repository.InfoRespository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRespository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

	public InfoFornecedor createFornecedor(InfoFornecedor fornecedor) {
		return infoRepository.save(fornecedor);
	}

}

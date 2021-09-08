package br.com.microservico.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservico.fornecedor.model.InfoFornecedor;
import br.com.microservico.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}
	
	@RequestMapping(name = "/", method = RequestMethod.POST)
	public InfoFornecedor createFornecedor(@RequestBody InfoFornecedor fornecedor) {
		return infoService.createFornecedor(fornecedor);
	}

}

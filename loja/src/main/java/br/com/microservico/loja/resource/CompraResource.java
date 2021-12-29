package br.com.microservico.loja.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservico.loja.dto.CompraDTO;
import br.com.microservico.loja.service.CompraService;
import br.com.microservico.loja.model.Compra;

@RestController
@RequestMapping("/compra")
public class CompraResource {
	
	@Autowired
	private CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Compra Compra(@RequestBody final CompraDTO compra) {
		return compraService.ralizaCompra(compra);
	}

}

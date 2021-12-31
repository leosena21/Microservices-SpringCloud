package br.com.microservico.loja.resource;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Compra GetById(@PathVariable("id") final UUID id) {
		return compraService.getById(id);
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public Compra Compra(@RequestBody final CompraDTO compra) {
		return compraService.ralizaCompra(compra);
	}

}

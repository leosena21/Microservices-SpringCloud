package br.com.microservico.loja.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservico.loja.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraResource {
	
	@RequestMapping(method = RequestMethod.POST)
	public void Compra(@RequestBody CompraDTO compra) {
		
	}

}

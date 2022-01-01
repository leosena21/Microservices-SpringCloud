package br.com.microservico.transportador.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservico.transportador.dto.EntregaDTO;
import br.com.microservico.transportador.dto.VoucherDTO;
import br.com.microservico.transportador.service.EntregaService;

@RestController
@RequestMapping("/entrega")
public class EntregaResource {
	@Autowired
	private EntregaService entregaService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody EntregaDTO pedidoDTO) {
		return entregaService.reservaEntrega(pedidoDTO);
	}
}

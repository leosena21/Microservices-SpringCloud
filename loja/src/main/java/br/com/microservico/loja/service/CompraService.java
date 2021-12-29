package br.com.microservico.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.microservico.loja.client.FornecedorClient;
import br.com.microservico.loja.dto.CompraDTO;
import br.com.microservico.loja.dto.InfoFornecedorDTO;
import br.com.microservico.loja.dto.InfoPedidoDTO;
import br.com.microservico.loja.model.Compra;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;
	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

	@HystrixCommand(fallbackMethod = "realizaCompraFallback")
	public Compra ralizaCompra(CompraDTO compra) {		
		
		LOG.info("buscando informações do fornecedor de {}", compra.getEndereco().getEstado());
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		
		LOG.info("realizando pedido");
		InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compra.getItens());
		System.out.println(info.getEndereco());
		
		Compra compraSalva = new Compra();
		compraSalva.setPedidoId(pedido.getId());
		compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
		compraSalva.setEnderecoDestino(compra.getEndereco().toString());
		return compraSalva;
	}
	
	public Compra realizaCompraFallback(final CompraDTO compra) {
		Compra compraFallback = new Compra();
		compraFallback.setEnderecoDestino(compra.getEndereco().toString());

		return compraFallback;
	}
}

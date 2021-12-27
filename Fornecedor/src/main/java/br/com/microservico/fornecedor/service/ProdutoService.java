package br.com.microservico.fornecedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservico.fornecedor.dto.ProdutoDTO;
import br.com.microservico.fornecedor.model.Produto;
import br.com.microservico.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	public Produto cadastraProduto(ProdutoDTO produto) {
		Produto novoProduto = new Produto();
		
		novoProduto.setNome(produto.getNome());
		novoProduto.setEstado(produto.getEstado());
		novoProduto.setDescricao(produto.getDescricao());
		novoProduto.setPreco(produto.getPreco());
		
		return produtoRepository.save(novoProduto);
	}

}

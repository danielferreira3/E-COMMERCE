package projeto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto1> produtosNoCarrinho = new ArrayList<>();
	
	private double valorTotal;
	
	private int metodoPagamento;
	
	

	public int getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public List<Produto1> getProdutosNoCarrinho() {
		return produtosNoCarrinho;
	}

	public void setProdutosNoCarrinho(List<Produto1> produtosNoCarrinho) {
		this.produtosNoCarrinho = produtosNoCarrinho;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void setarValorTotal(double valor) {
		for(int i = 0; i< produtosNoCarrinho.size(); i++) {
			 this.valorTotal += produtosNoCarrinho.get(i).getPreco();
		}
		
	}
	
	public void darDescontoDe10() {
		this.valorTotal = this.valorTotal * 0.90;
	}
	
	
	public void verificarPagamentoEDarDesconto() {
		if(this.metodoPagamento == 1) {
			this.valorTotal = this.valorTotal * 0.90;
		} else if (this.metodoPagamento == 2) {
			
		}
	}
	
	
	public String verificarSeExisteeAdicionarAoCarrinho(List<Produto1> listaDeProdutos, int opcao, int quantidade) {
		
		for(int i = 0; i<= listaDeProdutos.size(); i++) {

			if(listaDeProdutos.get(i).getCodigoProduto() == opcao) {
				this.produtosNoCarrinho.add(listaDeProdutos.get(i));
				return "Sucesso";
			} else {
				System.out.println("Nao encontrado");
			}
		 
		}
		return "Adicionado com sucesso";
		
	}
	
	

}
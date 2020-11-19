package projeto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto> produtosNoCarrinho = new ArrayList<>();
	
	private double valorTotal;
	
	private int metodoPagamento;
	
	

	public int getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public List<Produto> getProdutosNoCarrinho() {
		return produtosNoCarrinho;
	}

	public void setProdutosNoCarrinho(List<Produto> produtosNoCarrinho) {
		this.produtosNoCarrinho = produtosNoCarrinho;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void setarValorTotal() {
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
	
	
	public String verificarSeExisteeAdicionarAoCarrinho(List<Produto> listaDeProdutos, int opcao, int quantidade) {
		
		for(int i = 0; i<= listaDeProdutos.size(); i++) {

			if(listaDeProdutos.get(i).getCodigoProduto() == opcao) {
				this.produtosNoCarrinho.add(listaDeProdutos.get(i));
				return "Sucesso";
			} else {
				System.out.println("Nao encotnrado");
			}
		 
		}
		return "Adicionado com sucesso";
		
	}
	
	

}
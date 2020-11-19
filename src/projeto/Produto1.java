package projeto;

public class Produto1 {
	
	private String nome;
	
	private int codigoProduto;
	
	private int estoque;
	
	private double preco;
	
	
	

	public Produto1() {
		super();
	}

	public double getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
		
	
	public void setarEstoque(int quantidade) {
		this.estoque-=quantidade;
	}

}
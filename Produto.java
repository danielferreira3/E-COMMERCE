package Classes;

public class Produto {
	
	private int codProd;
	private String nome;
	private double precoProd;
	private int estoque;
	
	
	public Produto(int codProd, String nome, double precoProd, int estoque) {
		super();
		this.codProd = codProd;
		this.nome = nome;
		this.precoProd = precoProd;
		this.estoque = estoque;
	}


	public int getCodProd() {
		return codProd;
	}


	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrecoProd() {
		return precoProd;
	}


	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	public void retirarEstoque(int quantidade)
	{
		
		this.estoque -= quantidade;
	}
	

	
}

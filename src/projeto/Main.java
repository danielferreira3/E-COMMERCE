package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		int opcao;
		int quantidade;
		int opcaoUsuario = 0;
		
		List<Produto> listaDeProdutos = new ArrayList<>(); 
		Estoque estoqueCamsisas= new Estoque();
		
		
		Produto camiseta = new Produto();
		camiseta.setNome("Camisa de marca");
		camiseta.setCodigoProduto(0);
		camiseta.setPreco(100.0);
		
		Produto bone = new Produto();
		bone.setNome("Bone");
		bone.setCodigoProduto(1);
		bone.setPreco(100.0);
		
		Produto bone2 = new Produto();
		bone2.setNome("Tenis");
		bone2.setCodigoProduto(2);
		bone2.setPreco(100.0);
		
		Produto bone3 = new Produto();
		bone3.setNome("Camisa top");
		bone3.setCodigoProduto(3);
		bone3.setPreco(100.0);
		
		
		listaDeProdutos.add(camiseta);
		listaDeProdutos.add(bone);
		listaDeProdutos.add(bone2);
		listaDeProdutos.add(bone3);

		
		Carrinho carrinho = new Carrinho();
		
		Scanner input = new Scanner(System.in);

		
		for(int i = 0; i< listaDeProdutos.size(); i++) {
			 System.out.println("Produto " + listaDeProdutos.get(i).getNome() + " digite o codigo " +
		listaDeProdutos.get(i).getCodigoProduto() );
		}
		
		
		while (opcaoUsuario != 1) {
			System.out.println("Digite 1 para finalizar");
		opcaoUsuario = input.nextInt();
		
		
		System.out.println("Digite o codigo do produto");
		opcao= input.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = input.nextInt();
		
		System.out.println(carrinho.verificarSeExisteeAdicionarAoCarrinho(listaDeProdutos, opcao, quantidade));
		}
		
		for(Produto p: carrinho.getProdutosNoCarrinho()) {
			System.out.println(p.getNome());
		}
		
		
	}

}

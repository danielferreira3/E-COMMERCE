package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		int opcao;
		int quantidade1[] = new int [10];
		int opcaoUsuario = 0;
		int quantidade =0;
		int contador=0;
		List<Produto1> listaDeProdutos = new ArrayList<>(); 
		Estoque estoqueCamsisas= new Estoque();
		Carrinho carrinho1 = new Carrinho();
		
		Produto1 camiseta = new Produto1();
		camiseta.setEstoque(10);
		camiseta.setNome("Camisa");
		camiseta.setCodigoProduto(0);
		camiseta.setPreco(80.0);
		
		Produto1 bone = new Produto1();
		bone.setNome("Bone");
		bone.setEstoque(10);
		bone.setCodigoProduto(1);
		bone.setPreco(200.0);
		
		Produto1 tenis = new Produto1();
		tenis.setEstoque(10);
		tenis.setNome("Tenis");
		tenis.setCodigoProduto(2);
		tenis.setPreco(350.0);
		
		Produto1 calca = new Produto1();
		calca.setEstoque(10);
		calca.setNome("calca");
		calca.setCodigoProduto(3);
		calca.setPreco(100.0);
		
		Produto1 jaqueta = new Produto1();
		jaqueta.setNome("jaqueta");
		jaqueta.setEstoque(10);
		jaqueta.setCodigoProduto(4);
		jaqueta.setPreco(160.0);
		
		Produto1 luva = new Produto1();
		luva.setNome("luva");
		luva.setEstoque(10);
		luva.setCodigoProduto(5);
		luva.setPreco(10.0);
		
		Produto1 cinto = new Produto1();
		cinto.setNome("cinto");
		cinto.setEstoque(10);
		cinto.setCodigoProduto(6);
		cinto.setPreco(15.0);
		
		Produto1 chinelo = new Produto1();
		chinelo.setNome("chinelo");
		chinelo.setEstoque(10);
		chinelo.setCodigoProduto(7);
		chinelo.setPreco(60.0);
		
		Produto1 moletom = new Produto1();
		moletom.setNome("moletom");
		moletom.setEstoque(10);
		moletom.setCodigoProduto(8);
		moletom.setPreco(120.0);
		
		Produto1 regata = new Produto1();
		regata.setNome("Bone");
		regata.setEstoque(10);
		regata.setCodigoProduto(9);
		regata.setPreco(25.0);
		
		listaDeProdutos.add(camiseta);
		listaDeProdutos.add(bone);
		listaDeProdutos.add(tenis);
		listaDeProdutos.add(calca);
		listaDeProdutos.add(jaqueta);
		listaDeProdutos.add(luva);
		listaDeProdutos.add(cinto);
		listaDeProdutos.add(chinelo);
		listaDeProdutos.add(moletom);
		listaDeProdutos.add(regata);
		
		Carrinho carrinho = new Carrinho();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Codigo\t\tprodutos\tvalor\t\testoque");
		for(int i = 0; i< listaDeProdutos.size(); i++) {
			 System.out.println(listaDeProdutos.get(i).getCodigoProduto()+"\t\t"+listaDeProdutos.get(i).getNome()+ "\t\t"+
		listaDeProdutos.get(i).getPreco()+"\t\t" + listaDeProdutos.get(i).getEstoque() );
			 
		}
		
		
		while (opcaoUsuario != 1) {
			System.out.println("Digite 1 para finalizar");
		opcaoUsuario = input.nextInt();
		
		
		System.out.println("Digite o codigo do produto");
		opcao= input.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = input.nextInt();
		
		System.out.println(carrinho.verificarSeExisteeAdicionarAoCarrinho(listaDeProdutos, opcao, quantidade));
		
		
		
		for(Produto1 p: carrinho.getProdutosNoCarrinho()) {
			System.out.print(p.getNome() + p.getPreco());
			System.out.println();
			carrinho.setarValorTotal(p.getPreco());
			camiseta.setarEstoque(quantidade1[opcao]);
		}
		
	}
		
		System.out.println("preço total: ");
		System.out.println(carrinho.getValorTotal());
		System.out.println("Codigo\t\tprodutos\tvalor\t\testoque");
		for(int i = 0; i< listaDeProdutos.size(); i++) {
			 System.out.println(listaDeProdutos.get(i).getCodigoProduto()+"\t\t"+listaDeProdutos.get(i).getNome()+ "\t\t"+
		listaDeProdutos.get(i).getPreco()+"\t\t" + listaDeProdutos.get(i).getEstoque() );
			 
		}
	}

}

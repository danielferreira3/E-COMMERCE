package Codigo;

import java.util.ArrayList;
import java.util.Scanner;
import Classes.Produto;
import Classes.Pagamento;

public class Aplicacao {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		ArrayList<String> carrinho = new ArrayList<>();
		Pagamento pagamento = new Pagamento();
		
		int codigo, qtde, cont=0, opcaoPagamento=0;
		char opcao;
		double total=0;
		
		produtos.add(new Produto(1, "Camiseta azul    ", 10.00, 10));
		produtos.add(new Produto(2, "Camiseta vermelha", 11.00, 10));
		produtos.add(new Produto(3, "Camiseta verde   ", 12.00, 10));
		produtos.add(new Produto(4, "Camiseta rosa    ", 13.00, 10));
		produtos.add(new Produto(5, "Camiseta branca  ", 14.00, 10));
		produtos.add(new Produto(6, "Camiseta preta   ", 15.00, 10));
		produtos.add(new Produto(7, "Camiseta roxa    ", 16.00, 10));
		produtos.add(new Produto(8, "Camiseta amarela ",17.00, 10));
		produtos.add(new Produto(9, "Camiseta cinza   ",18.00, 10));
		produtos.add(new Produto(10, "Camiseta xadrez ",19.00, 10));
		
		//Cabeçalho
		System.out.print("=========");	
		System.out.print("  Bem vindo a Camisaria G7!  ");
		System.out.print("=========");
		
		//Lista de Produtos
		System.out.print("\n-----------------------------------------------\n");
		System.out.println("CÓDIGO	PRODUTO \t\tPREÇO   ESTOQUE");
		System.out.print("-----------------------------------------------\n");
		for (Produto itens : produtos)
		{
			System.out.println(itens.getCodProd()+"\t"+itens.getNome()+"\t"+itens.getPrecoProd()+"\t"+itens.getEstoque());
		}
		System.out.print("\n-----------------------------------------------\n");
		
		//Selecionar Produtos
		do {
			
			System.out.print("Insira o código do item: ");
			codigo = input.nextInt();
			System.out.print("Escolha a quantidade: ");
			qtde = input.nextInt();
			
			 cont=0;
			 for (Produto itens : produtos) {	 

				 if(itens.getCodProd() == codigo && itens.getEstoque()>=qtde)
				 {
					 carrinho.add(produtos.get(cont).getNome()+"\t\tR$"+produtos.get(cont).getPrecoProd()+"\t\t"+qtde);
					 total = (qtde* produtos.get(cont).getPrecoProd()) + total;
					 itens.retirarEstoque(qtde);
				 }
				 
				 else if(itens.getCodProd() == codigo && itens.getEstoque()<qtde)
				 {
					 System.out.print("O produto não possui a quantidade no estoque.");
				 }
				 cont++;
				 
			 }
			
		System.out.print("\nDeseja continuar comprando? S/N: ");
		opcao = input.next().toUpperCase().charAt(0);
		
		}while(opcao != 'N');
	
		
	   System.out.print("\n-----------------------------------------------\n");
	   System.out.println("PRODUTO \t\t\tPREÇO\tQUANTIDADE");
	   int qnt = 0;
	   for (String itens : carrinho) {
		   System.out.println(itens.indent(qnt));
		   qnt ++;
	   }
	   System.out.printf("Valor Total da Compra: R$%.2f",total);
	   pagamento.setValorFinal(total);
	   System.out.print("\n-----------------------------------------------\n");
	   
	   
	   
	   //Pagamento
	   do {
		   System.out.print("\nSelecione a forma de Pagamento");
		   System.out.print("\n1- Pagamento A vista \n2- Pagamento Cartao 1x \n3- Pagamento Cartão 2X \n4- Pagamento Cartão 3X");
		   System.out.println("\nOpcao escolhida: ");
		   opcaoPagamento = input.nextInt();
		   
		   if(opcaoPagamento == 1)
		   {
			   pagamento.pagamentoAvistaDinheiro();
			   pagamento.notaFiscal1();
			   int qnt1 = 0;
			   for (String itens : carrinho) 
			   {
				   System.out.println(itens.indent(qnt));
				   qnt1 ++;
			   }
			   pagamento.notaFiscal2();
		   }
		   else if(opcaoPagamento == 2)
		   {
			   pagamento.pagamentoAvistaCartao();
			   pagamento.notaFiscal1();
			   int qnt1 = 0;
			   for (String itens : carrinho) 
			   {
				   System.out.println(itens.indent(qnt));
				   qnt1 ++;
			   }
			   pagamento.notaFiscal2();
		   }
		   else if(opcaoPagamento == 3)
		   {
			   pagamento.pagamentoCartao2x();
			   pagamento.notaFiscal1();
			   int qnt1 = 0;
			   for (String itens : carrinho) 
			   {
				   System.out.println(itens.indent(qnt));
				   qnt1 ++;
			   }
			   pagamento.notaFiscal2();
		   }
		   else if(opcaoPagamento == 4)
		   {
			   pagamento.pagamentoCartao3x();
			   pagamento.notaFiscal1();
			   int qnt1 = 0;
			   for (String itens : carrinho) 
			   {
				   System.out.println(itens.indent(qnt));
				   qnt1 ++;
			   }
			   pagamento.notaFiscal2();
		   }
		   else if(opcaoPagamento <0 && opcaoPagamento<5)
		   {
			   System.out.println("Opcao Invalida");
		   }
		   
	   }while(opcaoPagamento <0 && opcaoPagamento<5);
	   

	   System.out.println("\n\n\nESTOQUE APOS A COMPRA");
	  for (Produto itens : produtos)
		{
			System.out.println(itens.getCodProd()+"\t"+itens.getNome()+"\t"+itens.getPrecoProd()+"\t"+itens.getEstoque());
	}
	}
}
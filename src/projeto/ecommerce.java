package projeto;

import java.util.Locale;
import java.util.Scanner;

public class ecommerce {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String produtos[] = { "CAMISA\t", "JAQUETA", "MOLETOM", "REGATA\t", "SHORT\t", "CALCA\t", "JALECO\t", "CINTO\t","LUVA\t", "MEIAS\t" };
		String entradas[] = new String[10];
		String entrada;		
		int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		char op = 'S';
		do {
		int quantidade[] = new int[10];
		double valor[] = { 30.00, 50.00, 120.00, 20.00, 30.00, 70.00, 10.00, 25.00, 10.00, 5.00 };
		int contador = 0;
		int numeroEntrada = 0;
		double total = 0;	
		boolean user=true;
		char novoUsuario;
		
		// pagamento
		
		double preco = 0;
		int codigo;
		double avista = 0, cartao1, cartao2, cartao3 = 0;
		double totalAvista = 0;// total de preco avista com impostos
		double totalCartao1 = 0;// total de preco cartao com impostos
		double totalCartao2 = 0;// total de preco cartao com impostos
		double totalCartao3 = 0;// total de preco cartao com impostos

		int indice = 0;
		char opcao = 'S';
		int giro = 0;
		
		System.out.println("SEJAM BEM VINDOS[AS] AO MYSTIC-STORE \n" + "\nAQUI ESTA NOSSO MENU DE PRODUTOS:\n");
		
		//DADOS DA PROGRAMAÇAO

		//while(user==true) {
		do {
			System.out.println("CODIGO \t\t PRODUTO\tVALOR\tQtd.Estoque");
			
			for (contador = 0; contador < 10; contador++) 
			{
				if (contador <= 11) 
				{
					entradas[contador] = "" + (contador + 1);
					System.out.println("--------------------------------------------------");
				}
				else
				{
					entradas[contador] = "" + (contador + 1);
				}
				

				numeroEntrada++;
				valor[contador] = valor[contador];
				estoque[contador] = estoque[contador];
				System.out.println(entradas[contador] + " \t\t " + produtos[contador] + "\t" + valor[contador] + "\t\t"+ estoque[contador]);

			}
			
			//REPETIÇAO DO MENU
			if (giro > 0)
			{
				System.out.println("\n__________________________________________________\n");
				System.out.println("CODIGO \t PRODUTO \tCARRINHO   Estoque");
				
				for (contador = 0; contador < 10; contador++) 
				{
					if (contador <= 9) 
					{
						entradas[contador] = "" + (contador + 1);
					} 
					else
					{
						entradas[contador] = "" + (contador + 1);
					}
					numeroEntrada++;
					if (quantidade[contador] > 0)
					{

						System.out.println(entradas[contador] + " \t " + produtos[contador] + " \t " + quantidade[contador] + "\t\t" + estoque[contador]);
					}
				}
			}
			//OPÇAO PARA O CLIENTE
			System.out.println("__________________________________________________");
			System.out.print("\nDIGITE O CODIGO DO PRODUTO: ");
			entrada = leia.next().toUpperCase();
			for (contador = 0; contador < 10; contador++)
			{
				if (entrada.equals(entradas[contador]))
				{
					indice = contador;
				}
			}
			

			System.out.print("DIGITE A QUANTIDADE DE PRODUTOS: ");

			int quantidadeEscolhida = leia.nextInt();

			if (quantidadeEscolhida <= estoque[indice])
			{
				estoque[indice] -= quantidadeEscolhida;
				quantidade[indice] += quantidadeEscolhida;
			}
			else
			{
				System.out.println("Não temos mais essa quantidade no estoque escolha outro produto");
			}
			
			System.out.print("CONTINUAR S/N?: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println();
			giro++;
		}
		// LISTA DO CLIENTE
		while (opcao == 'S');
				numeroEntrada = 0;
				System.out.println("__________________________________________________________________________\n"
				+ "\n<><><><><><><><><><><><><><><><>ESTRATO<><><><><><><><>><><><><><><><><><>\n"
				+ "__________________________________________________________________________");
		
				System.out.println("PRODUTO\t\t\t\t\t\tQUANTIDADE");
				System.out.println();
		

		for (contador = 0; contador < 10; contador++) 
		{
			numeroEntrada++;
			if (quantidade[contador] > 0)
			{
				System.out.println(produtos[contador] + "\t\t\t\t\t\t " + quantidade[contador]);
				System.out.println("Valor do produto: " + valor[contador]);
				valor[contador] = (valor[contador] * quantidade[contador]);
				
				System.out.println("--------------------------------------------------------------------------");

				total=total+valor[contador];
				
			}
		}
		
		System.out.println("Total A Pagar: " + total + "\n");
		System.out.println("__________________________________________________________________________\n"
				+ "\n<><><><><><><><><><><><><><><><><><><<><><><><><><><><>><><><><><><><><><>\n"
				+ "__________________________________________________________________________\n\n");
		
		//FORMA DE PAGAMENTO

		System.out.println("==========================FORMA DE PAGAMENTO==============================\n ");

		// fazendo total sem imposto
		avista = Math.floor(total * 0.8);
		cartao1 = Math.floor(total * 0.85);
		cartao2 = Math.floor(total / 2);
		cartao3 = Math.floor((total * 1.1) / 3);

		// fazendo o total com imposto
		totalAvista = (avista + (Math.floor(0.09 * avista)));
		totalCartao1 = (cartao1 + (Math.floor(0.09 * cartao1)));
		totalCartao2 = ((cartao2 + (Math.floor(0.09 * cartao2))) + (cartao2 + (Math.floor(0.09 * cartao2))));// soma parcela
																									
		totalCartao3 = ((cartao3 + (Math.floor(0.09 * cartao3))) + (cartao3 + (Math.floor(0.09 * cartao3)))
		+ (cartao3 + (Math.floor(0.09 * cartao3))));// soma parcela
		
		
		// imprimindo os valores e o imposto separadamente
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("1- Valor à vista: " + total + " Desconto de 20%: " + avista + " + Imposto de : "
				+ (Math.floor(0.09 * avista)));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("2- Valor à vista no cartão: " + total + " Desconto de 15%: " + cartao1
				+ " + Imposto de: " + (Math.floor(0.09 * cartao1)));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("3- Valor em 2x: " + total + " + imposto de: " + (Math.floor(0.09 * cartao2)));
		System.out.println("Primeira parcela = " + (cartao2 + Math.floor(0.09 * cartao2)));
		System.out.println("Segunda parcela = " + (cartao2 + Math.floor(0.09 * cartao2)));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("4- Valor em 3x: " + total + " + valor com juros de 10%: " + cartao3
				+ " + imposto de: " + (Math.floor(0.09 * cartao3)));
		System.out.println("Primeira parcela = " + (Math.floor(cartao3 + (Math.floor(0.09 * cartao3)))));
		System.out.println("Segunda parcela = " + (Math.floor(cartao3 + (Math.floor(0.09 * cartao3)))));
		System.out.println("Terceira parcela = " + (Math.floor(cartao3 + (Math.floor(0.09 * cartao3)))));
		System.out.println("--------------------------------------------------------------------------");

		// cliente ja pagando com ou sem juros e desconto e os impostos  ja somado 
		System.out.print("\nDigite o codigo de pagamento: ");
		codigo = leia.nextInt();

		if (codigo == 1)
		{
			System.out.println("Total a pagar: " + totalAvista);
		}

		else if (codigo == 2)
		{
			System.out.println("Total a pagar: " + totalCartao1);
		}

		else if (codigo == 3)
		{
			System.out.println("Total a pagar: " + totalCartao2);
		}

		else if (codigo == 4)
		{
			System.out.println("Total a pagar: " + totalCartao3);
		}

			// imprimindo nota fiscal
			System.out.print("\nDeseja imprimir a nota fiscal S/N: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println();

			if (opcao == 'S')
			{	
				 if (codigo==1)
				{
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
				System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
				System.out.println("--------------------------------------------------------------------------");
			//	System.out.println("\n");

				// informaçao da compra

				for (contador = 0; contador < 10; contador++)
				{

					if (quantidade[contador] > 0)
					{
						//System.out.println("__________________________");
						System.out.println("PRODUTO\t\t\t\tVALOR\t\t\tQUANTIDADE");
						System.out.println(
								produtos[contador] + "\t\t\t" + valor[contador] + "\t\t\t\t " + quantidade[contador]);
						System.out.println("--------------------------------------------------------------------------");

					//	System.out.println("\n\nValor total do produto " + totalAvista);
						//System.out.println("__________________________");
						
					}

				}
				System.out.println("\nDESCONTO em 20%\n\nIMPOSTO de 9%");
				System.out.println("\nValor total do produto " + total + " Reais");
				System.out.println("Valor a pagar com Desconto " + totalAvista+" Reais");
				System.out.println("\n__________________________");
				System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
				
				}
				 
				  if (codigo==2)
				  {
					  System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
					  System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
					  System.out.println("--------------------------------------------------------------------------");
					  for (contador = 0; contador < 10; contador++)
					  {
						  //informaçao da compra
						  if (quantidade[contador] > 0)
						  {
						//	System.out.println("\n__________________________");
							System.out.println("PRODUTO\t\t\t\tVALOR\t\t\tQUANTIDADE");
							System.out.println(produtos[contador] + "\t\t\t" + valor[contador] + "\t\t\t\t " + quantidade[contador]);
							System.out.println("--------------------------------------------------------------------------");
						//	System.out.println("__________________________");

						  }

					  }
				System.out.println("\nDESCONTO em 15%\n\nIMPOSTO de 9%");
				System.out.println("\nValor total do produto " + total + "\nValor a pagar com Desconto " + totalCartao1);
				System.out.println("\n__________________________");
				System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
						
				}
				 
				  if (codigo==3)
				  {
					  System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
					  System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
					  System.out.println("--------------------------------------------------------------------------");

				// informaçao da compra

					  for (contador = 0; contador < 10; contador++)
					  {
				
						  if (quantidade[contador] > 0)
						  {
							//  System.out.println("\n__________________________");
							  System.out.println("PRODUTO\t\t\t\tVALOR\t\t\tQUANTIDADE");
							  System.out.println(produtos[contador] + "\t\t\t" + valor[contador] + "\t\t\t\t " + quantidade[contador]);
							  System.out.println("--------------------------------------------------------------------------");

							 // System.out.println("\nValor a ser pago " + totalCartao2);
							//  System.out.println("__________________________");

						  }

					  }
					  		System.out.println("\nIMPOSTO de 9%");
					  		System.out.println("\nValor a ser pago " + totalCartao2);
					  		System.out.println("Parcela de 2 X de " + (totalCartao2 / 2)+ "Reais");
					  		System.out.println("\n__________________________");
					  		System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
				}
				  
				 if (codigo==4)
				 {
					 System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
					 System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
					 System.out.println("--------------------------------------------------------------------------");

					 // informaçao da compra

					 for (contador = 0; contador < 10; contador++)
					 {
				
						 if (quantidade[contador] > 0)
						 {
							// System.out.println("\n__________________________");
							 System.out.println("PRODUTO\t\t\t\tVALOR\t\t\tQUANTIDADE");
						//	 System.out.println("__________________________\n");
						
							 System.out.println(produtos[contador] + "\t\t\t" + valor[contador] + "\t\t\t\t " + quantidade[contador]);
							 System.out.println("--------------------------------------------------------------------------");
							 
							
						//	 System.out.println("\nValor total do produto " + totalCartao3);
						//	 System.out.println("__________________________");

						 }
					 }
					 
				System.out.println("\n\nJUROS 10%\n\nIMPOSTO de 9%");
				System.out.println("\nValor total do produto " + total + "\nValor a pagar com juros " + totalCartao3 + " Reais");
				System.out.println("Parcela de 3 X de "+(totalCartao3/3)+ " Reais");
				System.out.println("\n\n__________________________");
				System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
								
				}
	
			}	
			
					
			else if (opcao == 'N')
			{
				System.out.println("\n\n__________________________");
				System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
			}
		
		//RESET DO PROGRAMA(NOVO CLIENTE) 	OBS DE ERRO.: O NOVO CLIENTE ACABA RECEBENDO OS PRODUTOS DO ANTIGO CLIENTE
				System.out.println("\n");
				System.out.print("Entrar com novo cliente? S/N: ");
				
				op=leia.next().toUpperCase().charAt(0);
			
		
		
		}while (op == 'S');
	
			
			//CASO NAO TIVER CLIENTE O PROGRAMA TODO SERA FINALIZADO
		
			        
			System.out.println("=============================SERVIÇO FINALIZADo===========================");
		
			
		}
		
	}

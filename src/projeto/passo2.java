package projeto;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class passo2 {	
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	String produtos[] = {"CAMISA\t","JAQUETA","MOLETOM","REGATA\t","SHORT\t","CALCA\t","JALECO\t","CINTO\t","LUVA\t","MEIAS\t"};
	int quantidade[] = new int[10];
	String entradas[] = new String[10];
	String entrada;
	double valor[]= {30.00,50.00,120.00,20.00,30.00,70.00,10.00,25.00,10.00,5.00};
	int contador = 0;
	int numeroEntrada=0;
	double total = 0;
	int estoque[] = {10,10,10,10,10,10,10,10,10,10};
	
	//pagamento
	double valor1;
	double desconto;
	double parcela;
	double juros;
	int tipoPagamento;
	
	int indice=0;
	char opcao='S';
	int giro = 0;
	
	System.out.println("SEJAM BEM VINDOS[AS] AO MYSTIC-STORE \n"+"\nAQUI ESTA NOSSO MENU DE PRODUTOS:\n");
	
	do
	{
	System.out.println("CODIGO \t\t PRODUTO\tVALOR\tQtd.Estoque\n");
	
	for (contador = 0; contador <10; contador++ )
	 {
		if (contador<=11)
		{
			entradas[contador] = "CODIGO-0"+(contador+1);
			System.out.println("--------------------------------------------------");
		}
		else
		{		
			entradas[contador] = "CODIGO-"+(contador+1);
		}		
		
		numeroEntrada++;
		valor[contador]=valor[contador];
		estoque[contador] = estoque[contador];
		System.out.println(entradas[contador]+" \t "+produtos[contador]+"\t"+valor[contador] + "\t"+ estoque[contador]);
	
	 }
	if (giro>0)
	{
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>><><>\n"+"<><><><><><><><><><><><><><><><><><><><><><><><><><><>><><>");
//	System.out.println("QUANTIDADE DE PRODUTOS :");
	System.out.println("CODIGO \t\t PRODUTO \t CARRINHO\tQtd.Estoque");
	for (contador = 0; contador < 10; contador++ )
	  {	
		if (contador<=9)
		{
			entradas[contador] = "CODIGO-0"+(contador+1);
		}
		else
		{
			entradas[contador] = "CODIGO-"+(contador+1);
		}		
		numeroEntrada++;
		if (quantidade[contador] > 0)
		{					
			
			System.out.println(entradas[contador]+" \t "+produtos[contador]+" \t "+quantidade[contador] + "\t\t" + estoque[contador]);
		}	
	  }
	}
	//do {
	System.out.println("--------------------------------------------------");
	System.out.print("\nDIGITE O CODIGO DO PRODUTO : ");
	entrada = leia.next().toUpperCase();
	for (contador = 0; contador <10  ;contador++ ) {
		if (entrada.equals(entradas[contador]))
		{
			indice = contador;
		}	
	}		
	System.out.println(""+entradas[indice]);
	System.out.println(""+produtos[indice]+valor[indice]);
	
	System.out.print("\nDIGITE A QUANTIDADE DE PRODUTOS: ");
	
	int quantidadeEscolhida = leia.nextInt();

	
	if(quantidadeEscolhida <= estoque[indice]) {
		estoque[indice] -= quantidadeEscolhida;
		quantidade[indice] += quantidadeEscolhida;
	} else {
		System.out.println("Não temos mais essa quantidade no estoque escolha outro produto");
	//	JOptionPane.showMessageDialog(null, "Erro não temos essa quantidade no estoque");
		
		//quantidade[indice] = leia.nextInt();
	
	}
	//}while (estoque[indice]<0);		
	System.out.println("CONTINUAR S/N?:");
	
	opcao = leia.next().toUpperCase().charAt(0);
	giro++;	
	}
	while(opcao=='S');
	numeroEntrada=0;
	System.out.println("CODIGO \t\t PRODUTO \t\t\t QUANTIDADE \tEstoque");
	System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>><><><><><><><><\n"+"<><><><><><><><><><><><><><><><><><><><><><><><><><><>><><><><><><><><");
	System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
	System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
	
	for (contador = 0; contador < 10; contador++ )
	 {
		if (contador<=9)
		{
			entradas[contador] = "CODIGO-0"+(contador+1);
		}
		else
		{
			entradas[contador] = "CODIGO-"+(contador+1);
		}		
		numeroEntrada++;
		if (quantidade[contador] > 0) {
		System.out.println(entradas[contador]+" \t "+produtos[contador]+" \t\t\t "+quantidade[contador] + "\t\t" + estoque[contador]);
		valor[contador]=(valor[contador]*quantidade[contador]);
		System.out.println("Valor total de cada produto " + valor[contador]);
		System.out.println("-----------------------------------------------------------------------");
		//estoque[contador] = estoque[contador] - quantidade[contador];
		
		total+=valor[contador];
		}	
	//	System.out.println("Total A Pagar: "+ (valor[contador] + valor[indice]));
	}
	System.out.println("Total A Pagar: " + total+"\n");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	/*nota fiscal
	
	System.out.println("Insira o valor da compra");
	valor1 = teclado.nextDouble();
	System.out.println("Escolha o tipo de pagamento:");
	System.out.println("1 - À vista em dinheiro");
	System.out.println("2 - À vista no cartão de crédito");
	System.out.println("3 - Cartão de crédito em duas vezes");
	System.out.println("4 - Cartão de crédito em três vezes");
	
	//tipoPagamento =  teclado.nextInt();
	
	if (tipoPagamento == 1) {
		desconto = valor1 * 0.2;
		valor1 = valor1 - desconto;
		System.out.println("O valor da sua compra é de: R$" + valor);
	}
	
	else if (tipoPagamento == 2) {
		desconto = valor1 * 0.15;
		valor1 = valor1 - desconto;
		System.out.println("O valor da sua compra é de: R$" + valor);
	}
	
	else if (tipoPagamento == 3) {
		parcela = valorPagamento/2;
		System.out.println("Primeira parcela = " + parcela);
		System.out.println("Segunda parcela = " + parcela);
	}
	
	else {
		parcela = (valorPagamento * 1.1)/3;
		System.out.println("Primeira parcela = " + parcela);
		System.out.println("Segunda parcela = " + parcela);
		System.out.println("Terceira parcela = " + parcela);
	}
	
	*/
	
	
	
}
}




package projeto;

import java.util.Locale;
import java.util.Scanner;

public class passo1 {
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
		
		int indice=0;
		char opcao='S';
		int giro = 0;
		do
		{
		System.out.println("CODIGO \t\t PRODUTO\tVALOR\n");
		
		for (contador = 0; contador <10; contador++ )
		 {
			if (contador<=11)
			{
				entradas[contador] = "CODIGO-0"+(contador+1);
			}
			else
			{
				entradas[contador] = "CODIGO-"+(contador+1);
			}				
			numeroEntrada++;
			valor[contador]=valor[contador];
			System.out.println(entradas[contador]+" \t "+produtos[contador]+"\t"+valor[contador]);
		
		 }
		if (giro>0)
		{
		System.out.println("QUANTIDADE DE PRODUTOS :");
		System.out.println("CODIGO \t PRODUTO \t\t\t QUANTIDADE");
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
				System.out.println(entradas[contador]+" \t "+produtos[contador]+" \t\t\t "+quantidade[contador]);
			}	
		  }
		}
		
		
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
		quantidade[indice] = leia.nextInt();
		if(quantidade[indice]>10)
		{
			System.out.print("\nO LIMITE POR CLIENTES E DE 10 PRODUTOS DE CADA TIPO\nTENTE NOVAMENTE: ");
			quantidade[indice] = leia.nextInt();
		}
		System.out.println("CONTINUAR S/N?:");
		opcao = leia.next().toUpperCase().charAt(0);
		giro++;	
		}
		while(opcao=='S');
		numeroEntrada=0;
		System.out.println("CODIGO \t PRODUTO \t\t\t QUANTIDADE");
		
		
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
			System.out.println(entradas[contador]+" \t "+produtos[contador]+" \t\t\t "+quantidade[contador]);
			valor[contador]=(valor[contador]*quantidade[contador]);
			System.out.println("Valor total de cada produto " + valor[contador]);
			//System.out.println("Valor total a pagar  " + (valor[contador]));
			total+=valor[contador];

			}	
		//	System.out.println("Total A Pagar: "+ (valor[contador] + valor[indice]));
		}
		System.out.println("Total A Pagar: " + total);
	}
}

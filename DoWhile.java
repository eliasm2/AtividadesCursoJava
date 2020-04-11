package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite qualquer outra palavra ou sair para fechar o programa");
		String palavra = entrada.next();
		
				
		do 
		{
			System.out.println("Você digitou a palavra: " + palavra);
			if (!"sair".equalsIgnoreCase(palavra))
			{
			System.out.println("\nDigite qualquer outra palavra ou sair para fechar o programa");
			palavra = entrada.next();
			}
			
		}while(!"sair".equalsIgnoreCase(palavra));
		

		entrada.close();
	}

}

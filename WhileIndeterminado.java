package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite qualquer palavra para impressão ou digite sair para fechar o programa");
		String palavra = entrada.next();
		
		while(!"sair".equals(palavra.toLowerCase()))//poderia ter usado o equalsignorecase
		{
			
		System.out.println("Você digitou:  "+palavra);
		
		System.out.println("Digite qualquer palavra para impressão ou digite sair para fechar o programa");
		palavra = entrada.next();
			
		}
					
		entrada.close();
		
	}

}

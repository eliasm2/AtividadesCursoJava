package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de bom dias que você gostaria de receber");
		int number = entrada.nextInt();
		int i=0;
		while (i<number) 
		{
			System.out.println("Bom dia!!!!");
			i++;
		}
		entrada.close();
		
		
	}

}

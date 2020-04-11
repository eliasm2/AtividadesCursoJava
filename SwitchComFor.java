package controle;

import java.util.*;

public class SwitchComFor {
	public static void main(String[] args) {
		System.out.println("Informe a quantidade de notas:  ");
		Scanner entrada = new Scanner(System.in);
		int qtde = entrada.nextInt();
		
		
		
		String Conceito="";
		
		for (int i = 0; i < qtde; i++) 
		{
		
			System.out.println("Informe a nota: ");
			int nota= entrada.nextInt();
			
			switch(nota) 
			{
			case 10: case 9:
				Conceito="A";
				break;
			case 8: case 7:
				Conceito="B";
				break;
			case 6: case 5:;
				Conceito="C";
				break;
			case 4: case 3:
				Conceito="D";
				break;
			case 2: case 1: case 0:
				Conceito="E";
				break;
			default:
				Conceito="Sem Conceito!!!";
				break;
			}
			System.out.println("O seu conceito é: " + Conceito);
			
		}
		
		System.out.println("Obrigado por participar!!!");
		entrada.close();
		
	}

}

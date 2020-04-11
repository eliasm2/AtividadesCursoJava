package controle;

import java.util.Scanner;

public class DesafioIF {
	public static void main(String[] args) {
		//Colocar números de acordo com o dia da semana, ex: Domingo: 1, Segunda: 2...
		Scanner dia = new Scanner (System.in);
		
		System.out.println("Digite um dia da semana: ");
		String diadig= dia.next();
		
		if ("domingo".equals(diadig.toLowerCase())) 
		{
			System.out.println(1);
		}
		else if ("segunda".equals(diadig.toLowerCase())) 
		{
			System.out.println(2);
		}
		else if (("terça").equals(diadig.toLowerCase()) || ("terca").equals(diadig.toLowerCase()))
		{
			System.out.println(3);
		}
		else if ("quarta".equals(diadig.toLowerCase())) 
		{
			System.out.println(4);
		}
		else if ("quinta".equals(diadig.toLowerCase())) 
		{
			System.out.println(5);
		}
		else if ("sexta".equals(diadig.toLowerCase())) 
		{
			System.out.println(6);
		}
		else if (("sabado".equals(diadig.toLowerCase()))|| ("sábado".equals(diadig.toLowerCase()))) 
		{
			System.out.println(7);
		}
		else
			System.out.println("Digite um dia da semana válido");
		
		dia.close();
		
	}

}

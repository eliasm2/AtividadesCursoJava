package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		//receber 3 sal�rios diferentes COMO STRING e calcular a m�dia
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do primeiro sal�rio:\n ");
		String a = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o valor do segundo sal�rio:\n ");
		String b = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o valor do terceiro sal�rio:\n ");
		String c = entrada.nextLine().replace(",", ".");
		
		double ad=Double.parseDouble(a);
		double bd=Double.parseDouble(b);
		double cd=Double.parseDouble(c);
		
		double media = (ad+bd+cd)/3;
		System.out.println("A m�dia dos 3 sal�rios �: " + media);
				
		entrada.close();
	}
	
	

}

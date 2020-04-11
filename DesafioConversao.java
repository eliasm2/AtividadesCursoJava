package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		//receber 3 salários diferentes COMO STRING e calcular a média
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do primeiro salário:\n ");
		String a = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o valor do segundo salário:\n ");
		String b = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o valor do terceiro salário:\n ");
		String c = entrada.nextLine().replace(",", ".");
		
		double ad=Double.parseDouble(a);
		double bd=Double.parseDouble(b);
		double cd=Double.parseDouble(c);
		
		double media = (ad+bd+cd)/3;
		System.out.println("A média dos 3 salários é: " + media);
				
		entrada.close();
	}
	
	

}

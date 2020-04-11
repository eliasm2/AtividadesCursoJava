package fundamentos;

import java.util.Scanner;

public class DesafiodoMódulo {
	public static void main(String[] args) {
		//Ler dois número
		//Pedir pro usuário digitar alguma operação + - * / %
		//Fazer a operação matemática
		System.out.println("Digite dois números: \n");
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		System.out.println("Agora digite um operador aritmético para realizarmos uma operação:");
		String c = entrada2.nextLine();
		double d = Double.parseDouble(c);
		double calculo = a +d +b;
		
		//fazer o ternário
		
		System.out.println(calculo);
		
		entrada.close();
		entrada2.close();
		
		
	}

}

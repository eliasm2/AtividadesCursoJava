package fundamentos;

import java.util.Scanner;

public class DesafiodoM�dulo {
	public static void main(String[] args) {
		//Ler dois n�mero
		//Pedir pro usu�rio digitar alguma opera��o + - * / %
		//Fazer a opera��o matem�tica
		System.out.println("Digite dois n�meros: \n");
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		System.out.println("Agora digite um operador aritm�tico para realizarmos uma opera��o:");
		String c = entrada2.nextLine();
		double d = Double.parseDouble(c);
		double calculo = a +d +b;
		
		//fazer o tern�rio
		
		System.out.println(calculo);
		
		entrada.close();
		entrada2.close();
		
		
	}

}

package classe;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Comida c = new Comida();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Olá! \nDigite o seu nome:");
		p.nome=entrada.nextLine();
		System.out.println("\nDigite o seu peso atual:");
		p.pesoInicial=entrada.nextDouble();
		
		
		System.out.println("\nDigite o nome do primeiro alimento que você irá comer:");
		c.Nome=entrada.next();
		System.out.println("\nDigite o peso do primeiro alimento que você irá comer:");
		c.pesoInicial=entrada.nextDouble();
		
		p.pesoInicial=c.comerComida(p.pesoInicial, c.pesoInicial);
		System.out.println("O seu peso aumentou para:"+p.pesoInicial);
		
		
		System.out.println("\nDigite o nome do segundo alimento que você irá comer:");
		c.Nome=entrada.next();
		System.out.println("\nDigite o peso do segundo alimento que você irá comer:");
		c.pesoInicial=entrada.nextDouble();
		p.pesoInicial=c.comerComida(p.pesoInicial, c.pesoInicial);
		System.out.println("O seu peso aumentou para:"+p.pesoInicial);
		
		entrada.close();
	}

}

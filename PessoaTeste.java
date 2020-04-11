package Oocomposicao;

import java.util.Scanner;

public class PessoaTeste {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	Pessoa p1 = new Pessoa();
	p1.nome="Elias";
	
	p1.roupas.add(new Roupas("Meia",0.5));
	p1.roupas.add(new Roupas("Calça",1));
	p1.roupas.add(new Roupas("Camisa",0.9));
	p1.roupas.add(new Roupas("Luva",0.2));
	System.out.println("Digite o Seu peso: ");
	p1.pesoInicial=entrada.nextDouble();
	
	System.out.println("O peso total dessa pessoa com as roupas que está usando é:" + p1.obterpesototal());
	
	
	entrada.close();
}
}

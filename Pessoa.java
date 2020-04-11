package Oocomposicao;

import java.util.ArrayList;

public class Pessoa {
	
	String nome;
	double pesoInicial;
	ArrayList<Roupas> roupas = new ArrayList<Roupas>();
	
	double obterpesototal()
	{
		double total=pesoInicial;
		for(Roupas r1:roupas) {
		total=total+r1.peso;
		}
			
		return total;
}
}

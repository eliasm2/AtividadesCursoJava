package arrays;

import java.util.Scanner;

public class Foreach {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor digitar a quantidade de notas:");
		byte qtde= entrada.nextByte();
		
		double [] notas = new double[qtde];
		System.out.println("Digite as suas notas:\n ");
		
		int v=0;
		for (int i = 0; i < notas.length; i++) {
			v=i+1;
			System.out.print("Nota "+v + " :");
			notas[i]=entrada.nextDouble(); 
		}
		System.out.println("As suas notas são:\n");
		
		for(double nota: notas) 
		{
		System.out.println(nota);	
		}
		
		double soma=0;
		
		for (int i = 0; i < notas.length; i++) {
			soma=soma+notas[i];
		}
		double media=soma/qtde;
		System.out.println("A sua média é: "+media );
		
		
		
		

		entrada.close();
	}

}

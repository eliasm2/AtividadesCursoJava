package controle;

import java.util.Scanner;

public class SwitchesCases {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String Conceito="";
	    System.out.println("Digite a sua nota: ");
	    
	    int nota=entrada.nextInt();
	    
	    switch(nota) 
	    {
	    case 10: case 9:
	    	Conceito="A";
	    	break;
	    case 8: case 7: case 6:
	    	Conceito="B";
	    	break;
	    case 5: case 4:
	    	Conceito="C";
	    	break;
	    case 3: case 2:
	    	Conceito="D";
	    	break;
	    case 1: case 0:
	    	Conceito="E";
	    	break;
	    default:
	    	Conceito="Não encontrado";
	    	break;
	    }
	    
	    System.out.println("O seu conceito é: " + Conceito);
	    
	    
	    entrada.close();
	    
	    
	}



}

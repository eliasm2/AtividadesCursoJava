package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2"=="2");//Resultado ser� verdadeiro
		
		String s = "2";
		System.out.println("2"==s);//tamb�m sair� como verdadeiro
		System.out.println("2".equals(s)); // tamb�m sair� como verdadeiro
		
		Scanner entrada = new Scanner (System.in);
		
		String s2= entrada.nextLine();
		System.out.println("2"==s2);//Aqui o resultado sair� como falso, pois precisamos usar o equals
		System.out.println("2".equals(s2));//Aqui sair� verdadeiro se eu digitar somente o 2
		System.out.println("2".equals(s2.trim()));//Eu uso o trim, caso o usu�rio digite: "  2  "
		
		
		entrada.close();
		
	}

}

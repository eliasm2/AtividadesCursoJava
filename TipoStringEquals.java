package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2"=="2");//Resultado será verdadeiro
		
		String s = "2";
		System.out.println("2"==s);//também sairá como verdadeiro
		System.out.println("2".equals(s)); // também sairá como verdadeiro
		
		Scanner entrada = new Scanner (System.in);
		
		String s2= entrada.nextLine();
		System.out.println("2"==s2);//Aqui o resultado sairá como falso, pois precisamos usar o equals
		System.out.println("2".equals(s2));//Aqui sairá verdadeiro se eu digitar somente o 2
		System.out.println("2".equals(s2.trim()));//Eu uso o trim, caso o usuário digite: "  2  "
		
		
		entrada.close();
		
	}

}

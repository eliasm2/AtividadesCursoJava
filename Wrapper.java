package fundamentos;

import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Byte a=100;
		Short b=1000;
		Integer c = Integer.parseInt("1000");
		Long d = 10000000L;
		Integer e = Integer.parseInt(entrada.nextLine());
		
		System.out.println(a.byteValue());
		System.out.println(e);
		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		Character p ='E';
		System.out.println(p.toString().toLowerCase());
	}

}

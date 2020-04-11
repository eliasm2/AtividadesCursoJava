package controle;

import java.util.*;

public class For1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int number = entrada.nextInt();
		for(int i = 1; i<=number;i++) 
		{
			System.out.printf(" i= %d\n",i);
		}
		entrada.close();
	}
}

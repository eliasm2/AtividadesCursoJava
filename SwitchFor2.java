package controle;

import java.util.Scanner;


public class SwitchFor2 {
	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) 
		{
			if (i==5)  
			break;
			
			System.out.println("Valor de I �: "+i);
		}
		System.out.println("Acabou a repeti��o por causa do break");
	}

}

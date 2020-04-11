package controle;

public class ForComContinue {
	
public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) 
		{
			if (i==4)  
			continue; // no continue ele volta nesse instante pro FOR PARA QUE ASSIM ELE CORTE O RESTO DO LAÇO
			
			System.out.println("Valor de I é: "+i);
		}
		System.out.println("Acabou a repetição");
	}


}

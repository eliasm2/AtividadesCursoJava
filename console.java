package fundamentos;
import java.util.*;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!"); //usando exemplo com PRINT -- N�O H� QUEBRA DE LINHA
		System.out.println("Bom dia!!!"); //usando exemplo com PRINTLN -- Haver� quebra de linha posteriormente
		
		Random number = new Random();
	
		System.out.printf("N�meros sorteados da megasena: %s %s %s %s %s %s \n \n", number.nextInt(60) ,number.nextInt(60) ,number.nextInt(60) ,number.nextInt(60) 
				,number.nextInt(60) ,number.nextInt(61)); //usando exemplo com PRINT
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n \nDigite o seu nome: ");
		String nome= entrada.nextLine();
		
		System.out.print("\n \nDigite o seu sobrenome: ");
		String sobrenome= entrada.nextLine();
		
		System.out.print("\n \nDigite a sua idade: ");
		int idade= entrada.nextInt();
		
		System.out.print("\n \nDigite o seu sal�rio: ");
		float salario= entrada.nextFloat();
				
		System.out.println("\nO nome do funcion�rio �: " + nome +" " + sobrenome + "\n\nA sua idade �: " + idade + "\n\nE o seu sal�rio �: "+ salario);
		
		entrada.close();
		
	
	}

}

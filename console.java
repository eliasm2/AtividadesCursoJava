package fundamentos;
import java.util.*;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!"); //usando exemplo com PRINT -- NÃO HÁ QUEBRA DE LINHA
		System.out.println("Bom dia!!!"); //usando exemplo com PRINTLN -- Haverá quebra de linha posteriormente
		
		Random number = new Random();
	
		System.out.printf("Números sorteados da megasena: %s %s %s %s %s %s \n \n", number.nextInt(60) ,number.nextInt(60) ,number.nextInt(60) ,number.nextInt(60) 
				,number.nextInt(60) ,number.nextInt(61)); //usando exemplo com PRINT
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n \nDigite o seu nome: ");
		String nome= entrada.nextLine();
		
		System.out.print("\n \nDigite o seu sobrenome: ");
		String sobrenome= entrada.nextLine();
		
		System.out.print("\n \nDigite a sua idade: ");
		int idade= entrada.nextInt();
		
		System.out.print("\n \nDigite o seu salário: ");
		float salario= entrada.nextFloat();
				
		System.out.println("\nO nome do funcionário é: " + nome +" " + sobrenome + "\n\nA sua idade é: " + idade + "\n\nE o seu salário é: "+ salario);
		
		entrada.close();
		
	
	}

}

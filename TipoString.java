package fundamentos;

public class TipoString {
public static void main(String[] args) {
	
	System.out.println("Olá pessoal!!!".charAt(0));
	//charAt é usado para saber qual a letra que está na posição informada
	
	String s="Boa Tarde";
	
	System.out.println(s.concat("!!! Tudo bem com vocês?"));
	System.out.println(s+"  Tudo bem com vocês?");
	System.out.println(s.startsWith("Boa"));//começa com
	System.out.println(s.startsWith("boa"));//começa com NÃO FUNCIONA SE TIVER ALGO DIFERENTE
	System.out.println(s.toLowerCase().startsWith("boa"));//aqui eu fiz o lower antes de verificar
	System.out.println(s.endsWith("Tarde"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));//nesse caso ele ignora maiúsculo e minúsculo
	
	var nome="Pedro";
	var sobrenome="Santos";
	var idade = 36;
	var salario = 5000f;
	
	System.out.printf("Nome: %s %s \nIdade: %d anos \nSalário: R$ %.2f \n\n ", nome, sobrenome, idade,salario);
	String frase = String.format("\nNome: %s %s \nIdade: %d anos \nSalário: R$ %.2f ", nome, sobrenome, idade,salario);
	System.out.println(frase);
	
	System.out.println("Essa é uma frase qualquer".contains("qual"));
	System.out.println("Essa é uma frase qualquer".substring(17));
	System.out.println("Essa é uma frase qualquer".substring(17,18));
	
}

	
}

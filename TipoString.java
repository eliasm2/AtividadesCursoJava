package fundamentos;

public class TipoString {
public static void main(String[] args) {
	
	System.out.println("Ol� pessoal!!!".charAt(0));
	//charAt � usado para saber qual a letra que est� na posi��o informada
	
	String s="Boa Tarde";
	
	System.out.println(s.concat("!!! Tudo bem com voc�s?"));
	System.out.println(s+"  Tudo bem com voc�s?");
	System.out.println(s.startsWith("Boa"));//come�a com
	System.out.println(s.startsWith("boa"));//come�a com N�O FUNCIONA SE TIVER ALGO DIFERENTE
	System.out.println(s.toLowerCase().startsWith("boa"));//aqui eu fiz o lower antes de verificar
	System.out.println(s.endsWith("Tarde"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));//nesse caso ele ignora mai�sculo e min�sculo
	
	var nome="Pedro";
	var sobrenome="Santos";
	var idade = 36;
	var salario = 5000f;
	
	System.out.printf("Nome: %s %s \nIdade: %d anos \nSal�rio: R$ %.2f \n\n ", nome, sobrenome, idade,salario);
	String frase = String.format("\nNome: %s %s \nIdade: %d anos \nSal�rio: R$ %.2f ", nome, sobrenome, idade,salario);
	System.out.println(frase);
	
	System.out.println("Essa � uma frase qualquer".contains("qual"));
	System.out.println("Essa � uma frase qualquer".substring(17));
	System.out.println("Essa � uma frase qualquer".substring(17,18));
	
}

	
}

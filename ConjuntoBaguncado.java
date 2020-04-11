package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//OBS: O SET NÃO ACEITA TIPOS PRIMITIVOS 
		conjunto.add(1.2); // ele fará a conversão para Double
		conjunto.add(true); // ele fará a conversão para Boolean
		conjunto.add("Teste");  
		System.out.println(conjunto.remove("Teste"));
		conjunto.add(1); // ele fará a conversão para Integer
		conjunto.add('x'); //ele fará a conversão para CHARACTER
		
		System.out.println("O tamanho é: "+ conjunto.size());
		
		conjunto.add("Teste");  
		
		//OBS: SE VOCÊ REPETIR ALGUM ELEMENTO DO CONJUNTO ELE NÃO IRÁ ACRESCENTA-LO
		System.out.println("O tamanho é: "+ conjunto.size());
		
		
		//Agora iremos remover elementos;
		conjunto.remove("Teste");
		conjunto.remove('x');
		System.out.println("O tamanho é: "+ conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		///Ao invés de usar HashSet no início eu posso usar somente a palavra SET
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //união entre dois conjuntos
		
		
		conjunto.retainAll(nums);// esse faz a interseção entre dois conjuntos
		
		System.out.println(conjunto);
		
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}

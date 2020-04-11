package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//OBS: O SET N�O ACEITA TIPOS PRIMITIVOS 
		conjunto.add(1.2); // ele far� a convers�o para Double
		conjunto.add(true); // ele far� a convers�o para Boolean
		conjunto.add("Teste");  
		System.out.println(conjunto.remove("Teste"));
		conjunto.add(1); // ele far� a convers�o para Integer
		conjunto.add('x'); //ele far� a convers�o para CHARACTER
		
		System.out.println("O tamanho �: "+ conjunto.size());
		
		conjunto.add("Teste");  
		
		//OBS: SE VOC� REPETIR ALGUM ELEMENTO DO CONJUNTO ELE N�O IR� ACRESCENTA-LO
		System.out.println("O tamanho �: "+ conjunto.size());
		
		
		//Agora iremos remover elementos;
		conjunto.remove("Teste");
		conjunto.remove('x');
		System.out.println("O tamanho �: "+ conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		///Ao inv�s de usar HashSet no in�cio eu posso usar somente a palavra SET
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //uni�o entre dois conjuntos
		
		
		conjunto.retainAll(nums);// esse faz a interse��o entre dois conjuntos
		
		System.out.println(conjunto);
		
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}

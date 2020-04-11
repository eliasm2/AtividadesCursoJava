package colecoes;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String>	lista = new HashSet<String>(); // esse é o não organizado
		SortedSet<String>	lista = new TreeSet<String>(); //já esse faz a ordenação
		lista.add("Ana");
		lista.add("Elias");
		lista.add("Carlos");
		lista.add("Teste");
		
		for(String candidato:lista) {
			System.out.println(candidato);
		}
		
		///Set<Usuario> list2 = new HashSet<Usuario>(); somente como exemplo =)
		
		Set<Integer>	listaInteger = new HashSet<Integer>(); //Ele NÃO ACEITA INT, SOMENTE INTEGER
		listaInteger.add(1);
		listaInteger.add(2);
		listaInteger.add(3);
		listaInteger.add(4);
		
		for(Integer candidato:listaInteger) {
			System.out.println(candidato);
		}
		
	
	}

}

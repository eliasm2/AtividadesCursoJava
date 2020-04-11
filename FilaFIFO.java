package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaFIFO {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Teste");
		fila.add("Teste1");
		fila.add("Teste2");
		fila.add("Teste3");
		fila.offer("Teste4");
		fila.remove("Teste1");
		
		for(String teste:fila) 
		{
			System.out.println(teste);
		}
		
		//O ****peek**** e o ***element*** � usado para saber quem � o primeiro da fila
		System.out.println("\nO primeiro elemento da fila �: "+fila.peek()); // se a fila tiver vazia retorna null
		System.out.println("\n O primeiro elemento da fila �: "+ fila.element()); // se a fila tiver vazia retorna erro 
		
		System.out.println(" O tamanho da fila �: "+fila.size());
		
		System.out.println("Agora a fila esta vazia? " + fila.isEmpty());
		
		//fila.clear();
		System.out.println("Agora a fila esta vazia? " + fila);
		
		// j� o POOL � para REMOVER O ELEMENTO DA FILA , eu posso usar o remove(), por�m se a fila estiver vazia o remove() levanta uma exce��o 
		fila.poll();
		for(String teste:fila) 
		{
			System.out.println("\n"+teste);
		}
		
		
	}

}

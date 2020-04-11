package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaLIFO {
	public static void main(String[] args) {
		Deque<String> pilhalivros = new ArrayDeque<String>();
		pilhalivros.add("O pequeno príncipe");
		pilhalivros.push("Dom Quixote");
		pilhalivros.push("O Hobbit");

		
		System.out.println(pilhalivros.peek()); // podemos observar que ele pegara o hobbit, pois foi o último a ser adicionado
		System.out.println(pilhalivros.element()); //faz a mesma coisa que o peek
		pilhalivros.poll();
		System.out.println(pilhalivros.peek());// agora aparecerá o Dom Quixote, pois com o pool acima eu removi o hobbit
		//POSSO USAR O POP E O REMOVE TAMBÉM
		pilhalivros.size();//TAMANHO
		pilhalivros.clear();//PARA LIMPAR TUDO
		//pilhalivros.CONTAIS();
		pilhalivros.isEmpty();//verifica se está vazio
		
		
	}

}

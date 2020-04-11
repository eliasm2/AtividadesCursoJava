package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaLIFO {
	public static void main(String[] args) {
		Deque<String> pilhalivros = new ArrayDeque<String>();
		pilhalivros.add("O pequeno pr�ncipe");
		pilhalivros.push("Dom Quixote");
		pilhalivros.push("O Hobbit");

		
		System.out.println(pilhalivros.peek()); // podemos observar que ele pegara o hobbit, pois foi o �ltimo a ser adicionado
		System.out.println(pilhalivros.element()); //faz a mesma coisa que o peek
		pilhalivros.poll();
		System.out.println(pilhalivros.peek());// agora aparecer� o Dom Quixote, pois com o pool acima eu removi o hobbit
		//POSSO USAR O POP E O REMOVE TAMB�M
		pilhalivros.size();//TAMANHO
		pilhalivros.clear();//PARA LIMPAR TUDO
		//pilhalivros.CONTAIS();
		pilhalivros.isEmpty();//verifica se est� vazio
		
		
	}

}

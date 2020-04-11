package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Ana");
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(u1); 
		lista.add(new Usuario("Elias"));
		lista.add(new Usuario("Teeeste"));
		
		
		System.out.println(lista.get(2));//obtendo dados pelo ID
		
		for(Usuario listas:lista) {
			System.out.println(listas.nome);
		}
		
		lista.remove(1);
		
		for(Usuario listas:lista) {
			System.out.println(listas.nome);
		}
		lista.remove(new Usuario("Ana")); // assim eu removo pelo nome do objeto instanciado usuario
		for(Usuario listas:lista) 
		{
			System.out.println(listas.nome);
		}
		
		System.out.println("Tem ? "+ lista.contains(new Usuario("Teeeste")));
	}

}

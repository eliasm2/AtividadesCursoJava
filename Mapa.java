package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1,"Roberto");
		usuarios.put(2, "Elias");
		usuarios.put(3,"Paul");
		usuarios.put(4, "Marcela");
		//se eu fizer usuarios.put(1,"Carlos"); , ele irá substituir, pois a chave é única
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());//irá imprimir as chaves
		System.out.println(usuarios.values());//irá imprimir os valores
		System.out.println(usuarios.entrySet());//irá imprimir chave=valor
//_________________________________________________________________________________________________________________________________
		for(int mapa:usuarios.keySet()) //para percorrer imprimindo somente a chave 
		{
			System.out.println(mapa);
		}
//_________________________________________________________________________________________________________________________________		
		for(String mapa:usuarios.values()) //para percorrer imprimindo somente o valor 
		{
			System.out.println(mapa);
		}
//_________________________________________________________________________________________________________________________________		
		for(Entry<Integer, String> registro: usuarios.entrySet()) //para percorrer imprimindo somente o valor 
		{
			System.out.println(registro);
		}
		
		
		
		
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Elias"));
		System.out.println(usuarios.get(2));
	}

}

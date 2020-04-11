package Oocomposicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.itens.add(new Item("Caneta",20,1.20));
		c1.itens.add(new Item("Lápis",25,1));
		c1.itens.add(new Item("Borracha",5,0.40));
		c1.itens.add(new Item("Apontador",10,0.80));
		System.out.println(c1.itens.size());
		
		//para calcular valor total do item
		System.out.println(c1.obterValorTotal());
		
		
		
	}
	
	

}

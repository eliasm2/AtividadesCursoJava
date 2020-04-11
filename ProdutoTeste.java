package classe;
public class ProdutoTeste {
	public static void main(String[] args) {
	Produto p1 = new Produto();
	var p2 = new Produto();
	
	p1.nome="Notebook";
	p1.preco=4365.55;
	p1.desconto=0.10;
	
	p2.nome="Caneta Preta";
	p2.preco=3.00;
	p2.desconto=0.10;
	
	
	System.out.println(p1.nome);
	//System.out.println(p2.nome);
	
	double valorfinal1=p1.preco*(1-p1.desconto);
	System.out.printf("%.2f",valorfinal1);
	
	double valorteste= p1.precoComDesconto(p1.preco, p1.desconto);
	System.out.printf("\n\n\nAgora é com método  %.2f " ,valorteste );
	
	
	
	}

}

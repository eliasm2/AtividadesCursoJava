package classe;

public class ValorVsReferência {
	
	public static void main(String[] args) {
		int a= 2;
		a++;
		int b= a; //ATRIBUIÇÃO POR VALOR (TIPO PRIMITIVO)
		b--;
		
		System.out.println(b);
	    
		
		Data d1= new Data ();
		Data d2 = d1; //ATRIBUIÇÃO POR REFERÊNCIA (OBJETO)
		
		//d1.dia=31;
		//d2.mes=12;
		
		System.out.printf("A data será: %d/%d/%d \n\n\n\n", d2.dia,d1.mes,d1.ano);
		
		
		System.out.println(d1.obterdataformatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterdataformatada());
		
		alterarPrimitivo (b);
		
		System.out.println("\n\n"+b); // você pode observar que quando passamos valores primitivos para modificar através de um método,
		//o mesmo não ocorre, pois é um tipo primitivo e não um objeto
		
	}
	
	
	static void voltarDataParaValorPadrao(Data D) 
	{
		D.dia=01;
		D.mes=02;
		D.ano=1970;
	}
	static void alterarPrimitivo (int a) 
	{	
		a++;
	}
	
	

}

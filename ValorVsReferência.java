package classe;

public class ValorVsRefer�ncia {
	
	public static void main(String[] args) {
		int a= 2;
		a++;
		int b= a; //ATRIBUI��O POR VALOR (TIPO PRIMITIVO)
		b--;
		
		System.out.println(b);
	    
		
		Data d1= new Data ();
		Data d2 = d1; //ATRIBUI��O POR REFER�NCIA (OBJETO)
		
		//d1.dia=31;
		//d2.mes=12;
		
		System.out.printf("A data ser�: %d/%d/%d \n\n\n\n", d2.dia,d1.mes,d1.ano);
		
		
		System.out.println(d1.obterdataformatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterdataformatada());
		
		alterarPrimitivo (b);
		
		System.out.println("\n\n"+b); // voc� pode observar que quando passamos valores primitivos para modificar atrav�s de um m�todo,
		//o mesmo n�o ocorre, pois � um tipo primitivo e n�o um objeto
		
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

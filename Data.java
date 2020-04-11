package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data()
	{
		dia=1;
		mes=1;
		ano=1970;	
	}
		
	Data(int dia, int mesInicial, int anoInicial)
	{
		this.dia=dia;
		this.mes=mesInicial;
		this.ano=anoInicial;
	}

	
	String obterdataformatada() 
	{
		final String formato = "%d/%d/%d";
		String resultado = String.format(formato,dia,mes,ano);
		return resultado;
	}
	void imprimirDataFormatada()
	{
		System.out.println(obterdataformatada());
	}
}

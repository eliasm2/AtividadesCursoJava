package Oocomposicao;

public class motor {
	boolean ligado = false;
	double  fatorinjecao=1;
	//protected ele s� deixa ser usado quem ta no pacote, obs: posso usar em Subpacote
	//private � somente na classe
	//public fica v�sivel para todos os pacotes/classes
	//default � igual ao protected, por�m eu n�o posso usar em subpacotes
	//final n�o pode ser reescrito
	//static � usado quando o valor � est�tico e � membro da classe, como o valor PI por exemplo
	//abstract (somente em classes) --> n�o pode ser instanciada
	
	
	int giros() 
	{
		if(!ligado)
			return 0;
		else
			return (int) Math.round(fatorinjecao*3000);	// esse m�todo arredonda
	}

}

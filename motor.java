package Oocomposicao;

public class motor {
	boolean ligado = false;
	double  fatorinjecao=1;
	//protected ele só deixa ser usado quem ta no pacote, obs: posso usar em Subpacote
	//private é somente na classe
	//public fica vísivel para todos os pacotes/classes
	//default é igual ao protected, porém eu não posso usar em subpacotes
	//final não pode ser reescrito
	//static é usado quando o valor é estático e é membro da classe, como o valor PI por exemplo
	//abstract (somente em classes) --> não pode ser instanciada
	
	
	int giros() 
	{
		if(!ligado)
			return 0;
		else
			return (int) Math.round(fatorinjecao*3000);	// esse método arredonda
	}

}

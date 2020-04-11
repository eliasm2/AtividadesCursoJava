package Oocomposicao;

public class Carro {
	motor motor = new motor();
	
	void acelerar() 
	{
		if(motor.fatorinjecao<2.6)
			motor.fatorinjecao+=0.4;
	}
	void frear() 
	{
		if(motor.fatorinjecao>=0.5)
			motor.fatorinjecao-=0.4;
	}
	void ligar() 
	{
		motor.ligado=true;
	}
	void desligar() 
	{
		motor.ligado=false;
	}
	boolean estaLigado() 
	{
		return motor.ligado;
	}
	
}

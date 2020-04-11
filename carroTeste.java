package Oocomposicao;

public class carroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
	
		
		//se eu fiz as duas linhas abaixo dará valor negativo
		//Faltou encapsulamento
		//c1.motor.fatorinjecao=-30;
		System.out.println(c1.motor.giros());
		
	}

}

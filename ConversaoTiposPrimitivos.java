package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoTiposPrimitivos {
	
	public static void main(String[] args) {
		
		float b = (float) 1.0; //Estou usando o CAST PARA CONVERS�O EXPL�CITA
		
		double e = 1.9999;
		int f= (int) e;
		System.out.println(f); // convers�o expl�cita
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro n�mero:\n");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo n�mero:\n");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1+numero2;
		
		System.out.println("A somat�ria de ambos os n�meros � :" +soma);
		
	}

}

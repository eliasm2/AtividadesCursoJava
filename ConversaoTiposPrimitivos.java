package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoTiposPrimitivos {
	
	public static void main(String[] args) {
		
		float b = (float) 1.0; //Estou usando o CAST PARA CONVERSÃO EXPLÍCITA
		
		double e = 1.9999;
		int f= (int) e;
		System.out.println(f); // conversão explícita
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro número:\n");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo número:\n");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1+numero2;
		
		System.out.println("A somatória de ambos os números é :" +soma);
		
	}

}

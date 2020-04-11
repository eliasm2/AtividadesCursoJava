package arrays;

import java.util.Scanner;

public class DesafioNotasSala {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos: ");
		byte qtalunos = entrada.nextByte();
		System.out.println("Informe a quantidade de notas de cada aluno: ");
		byte qtnotasturma = entrada.nextByte();
		
		byte []alunos = new byte[qtalunos];
		double []notasturma = new double[qtnotasturma];
		int v,g=0;
		double soma=0;
		for (int i = 0; i < alunos.length; i++) {
			for (int j = 0; j < notasturma.length; j++) {
				v=i+1;
				g=j+1;
				System.out.println(g+"º Nota do "+v+"º aluno");
				notasturma[j]=entrada.nextDouble();
				soma=soma+notasturma[j];
			}
			
		}
	
		double media = soma/qtnotasturma;
		media=media/qtalunos;
		System.out.println("A média geral da turma foi: "+media );
		entrada.close();
		
	}

}

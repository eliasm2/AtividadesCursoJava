package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double [] notasAlunoA = new double[3];
		
		notasAlunoA[0]= 3.5;
		notasAlunoA[1]= 5;
		notasAlunoA[2]= 10;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunosA=0;
		for (int i = 0; i <notasAlunoA.length ; i++) 
		{
			totalAlunosA+=notasAlunoA[i];
		}
		totalAlunosA=totalAlunosA/notasAlunoA.length;
		System.out.printf("Média: %.2f\n",totalAlunosA);
		
		
		double notasAlunoB [] = {3,5,6,7};
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunosB=0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunosB+=notasAlunoB[i];
		}
		
		System.out.printf("\nMédia: %.2f",totalAlunosB=totalAlunosB/notasAlunoB.length);
	}

}

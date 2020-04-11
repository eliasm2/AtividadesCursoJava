package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua nota (entre 0 e 10) ou digite -1 para sair : ");
		int nota= entrada.nextInt();
		int total=0;
		int cont = 0;
		if ((nota>10)||(nota<-1)) 
		{
			System.out.println("Digite um valor válido");
			nota=0;
			cont--;
		}
		while(nota!=-1) 
		{
			total=total+nota;
			cont++;
			System.out.println("Digite a sua nota (entre 0 e 10) ou digite -1 para sair : ");
			nota= entrada.nextInt();
			
			if ((nota>10)||(nota<-1)) 
			{
				System.out.println("Digite um valor válido");
				nota=0;
				cont--;
			}
		}
		double media=0.0;
		
		if ((total>0)&&(nota>=0))
		{
			media = total/cont;
		}
		System.out.println("A média das notas foi:  " + media);
		

		entrada.close();
		
	}

}

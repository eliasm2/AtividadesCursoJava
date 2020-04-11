package fundamentos.operadores;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		int primq = (6 *(3+2));
		int primq2 = ((int) Math.pow(primq, 2))/(3*2);
		System.out.println(primq2);
		
		int segq = ((1-5)*(2-7))/2;
		int segq2= (int)Math.pow(segq, 2);
		System.out.println(segq2);
		
		int t= (primq2-segq2);
		int newt= (int) Math.pow(t, 3);
		int newdt = (int) Math.pow(10, 3);
		int newnewt=newt/newdt;	
		System.out.println(newnewt);
		
		
		
	}
}

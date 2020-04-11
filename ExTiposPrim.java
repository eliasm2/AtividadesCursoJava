package fundamentos;

public class ExTiposPrim {
	public static void main(String[] args) {
		var teste = 1000;
		System.out.println(teste);
		char t  = 'a';
		System.out.println(t);
		boolean bol = false;
		System.out.println(bol);
		byte by = 127;
		System.out.println(by);
		short shor = 9999;
		System.out.println(shor);
		int inteiro = 999999999;
		System.out.println(inteiro);
		long longint = 949999999999999999L;
		System.out.println(longint);
		float flut = 9.999994999F;
		System.out.println(flut);
		double dd = 25.9999999;
		System.out.println(dd);
		String E = "       Testando X        ";
		System.out.println(E);
		
		E=E.toUpperCase();
		System.out.println(E);
		
		E=E.toLowerCase();
		System.out.println(E);
		
		E=E.trim();
		System.out.println(E);
		
		E=E.replace("x", "Senhora");
		System.out.println(E);
		
		E=E.concat("!!!");
		System.out.println(E);
			
		
		System.out.println("Elias".toUpperCase().concat(" O Fodao").toLowerCase());
		
		
	}

}

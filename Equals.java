package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1= new Usuario();
		u1.nome="Elias";
		u1.email="elias@gm.com";
		
		Usuario u2= new Usuario();
		u2.nome="Elias";
		u2.email="elias@gm.com";
		
		System.out.println(u1.equals(u2));

		
		
	}

}

package classe;

public class DataTeste {
	public static void main(String[] args) {
	 Data Data1 = new Data();	
	 
	 Data1.dia=03;
	 Data1.mes=04;
	 Data1.ano=2020;
	 
	 //System.out.printf("A data digitada foi: %d/%d/%d",Data1.dia,Data1.mes,Data1.ano);
	 String teste = Data1.obterdataformatada();
	 System.out.println(teste);
	 
	 
	}
	
	

}

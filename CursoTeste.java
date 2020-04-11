package Oocomposicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1= new Aluno("Elias");
		Aluno aluno2= new Aluno("Linhares");
		Aluno aluno3= new Aluno("Martins");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("WEB Completo");
		Curso curso3 = new Curso("React Nactive Completo");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarCursos(curso2);
		//aluno1.adicionarCursos(curso1);
		aluno2.adicionarCursos(curso3);
		
		for(Aluno aluno: curso1.alunos) 
		{
			System.out.println("Estou matriculado no curso: " + curso1.Nome);
			System.out.println("e o meu nome é: "+aluno.Nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.ObterCursoProcurado("React Nactive Completo");
	    
		if (cursoEncontrado!=null) {
			System.out.println(cursoEncontrado.alunos);
		}
		
	}

}

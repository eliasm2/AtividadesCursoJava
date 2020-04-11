package Oocomposicao;

import java.util.ArrayList;

public class Aluno {
	final String Nome;
	final ArrayList <Curso> cursos = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return Nome ;
	}
	Aluno (String Nome)
	{
		this.Nome=Nome;
	}
	void adicionarCursos(Curso curso)
	{
		this.cursos.add(curso); 
		curso.alunos.add(this);
	}
	
	Curso ObterCursoProcurado(String nome) 
	{
		for(Curso curso:this.cursos) 
		{
			if(curso.Nome.equalsIgnoreCase(nome));
				return curso;
		}
		
		return null;
	}

}

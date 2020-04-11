package Oocomposicao;

import java.util.ArrayList;

public class Curso {
	String Nome;
	final ArrayList <Aluno> alunos = new ArrayList<>();
	
	Curso (String Nome)
	{
		this.Nome=Nome;
	}
	
	void adicionarAlunos(Aluno aluno)
	{
		this.alunos.add(aluno); 
		aluno.cursos.add(this);
	}
}

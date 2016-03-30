package test;

import model.Aluno;

public class TestaAluno {

	public static void main(String[] args) {

    Aluno alunos = new Aluno("Fabio","50505050","contato@contato.com","63161616161-x","Alexandre G, 200",2444);
	alunos.cadastrar();
	alunos.consultar();
	System.out.println(alunos);
	alunos.setNome("Giovanni");
	alunos.alterar();
	alunos.consultar();
	System.out.println(alunos);
	alunos.deletar();
	
	}

}

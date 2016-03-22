package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import model.AlunosCRUD;

public class AlunosTest {

	AlunosCRUD alunos, copia;

	@Before
	public void setUp() throws Exception {
		alunos = new AlunosCRUD("9898", "Paulo","Rua Ico","php@php.com",12389898, 12331290);
		copia = new AlunosCRUD("9898", "Paulo","Rua Ico","php@php.com",12389898, 12331290);
	}
	
	@Test
	public void test00Carregar() {

		AlunosCRUD fixture = new AlunosCRUD("nome", "989","php@php.com","Rua Ico",123,1213313);
		AlunosCRUD novo = new AlunosCRUD(null,null,null,null,123,1213313);
		novo.consultar();
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		alunos.cadastrar();
		alunos.consultar();
		assertEquals("testa criacao", alunos, copia);
	}

	@Test
	public void test02Atualizar() {
		alunos.setEnd("Rua nova");
		copia.setEnd("Rua nova");		
		alunos.alterar();
		assertEquals("testa inclusao", alunos, copia);
	}

	@Test
	public void test03Excluir() {
		
		alunos.setEmail(null);
		alunos.setNome(null);
		alunos.setEnd(null);
		alunos.setRg(null);
		alunos.setTel(0);
		copia.setEmail(null);
		copia.setNome(null);
		copia.setEnd(null);
		copia.setRg(null);
		copia.setTel(0);
		
		alunos.deletar();
		assertEquals("testa inclusao", alunos, copia);
	}
}


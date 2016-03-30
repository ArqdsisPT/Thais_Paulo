package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Curso;

public class Cursotest {
	
	Curso cursos, copia;
	
	@Before
	public void setUp() throws Exception {
		cursos = new Curso("Info", "Programação", "LB02", "RS56677TU", "Pendrive", "Deitel", "01/01/01", "01/03/01", "09:09", 129, 210.90);
		copia = new Curso("Info", "Programação", "LB02", "RS56677TU", "Pendrive", "Deitel", "01/01/01", "01/03/01", "09:09", 129, 210.90);
	}
	
	@Test
	public void test00Carregar() {
	
		Curso fixture = new Curso("Info", "Programação", "LB02", "RS56677TU", "Pendrive", "Deitel", "01/01/01", "01/03/01", "09:09", 129, 210.90);
		Curso novo = new Curso (null,null,null,null,null,null,null,null,null,123,123.333);
		novo.consultar();
		assertEquals("testa inclusao", novo, fixture);
	}
	@Test
	public void test01Criar() {
		cursos.cadastrar();
		cursos.consultar();
		assertEquals("testa criacao", cursos, copia);
	}

	@Test
	public void test02Atualizar() {
		cursos.setNome("HTML");
		copia.setNome("HTML");	
		cursos.alterar();
		assertEquals("testa inclusao", cursos, copia);
	}

	@Test
	public void test03Excluir() {
		cursos.setDataIni(null);
		cursos.setDataTer(null);
		cursos.setHorario(null);
		cursos.setLivro(null);
		cursos.setMaterial(null);
		cursos.setNome(null);
		cursos.setNumLab(null);
		cursos.setRegSoft(null);
		cursos.setVagas(0);
		cursos.setValor(0.0);
		copia.setDataIni(null);
		copia.setDataTer(null);
		copia.setHorario(null);
		copia.setLivro(null);
		copia.setMaterial(null);
		copia.setNome(null);
		copia.setNumLab(null);
		copia.setRegSoft(null);
		copia.setVagas(0);
		copia.setValor(0.0);
		
		cursos.deletar();
		assertEquals("testa inclusao", cursos, copia);
	}

}
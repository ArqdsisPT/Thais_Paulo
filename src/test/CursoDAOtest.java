package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.CursoDAO;
import to.CursoTO;

public class CursoDAOtest {

	CursoDAO dao;
	CursoTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new CursoDAO();
		to = new CursoTO();
		to.setCod("Info");
		to.setNome("Programacao");
		to.setDataIni("01/01/01");
		to.setDataTer("01/04/01");
		to.setHorario("09:09");
		to.setMaterial("Pendrive");
		to.setLivro("Deitel");
		to.setNumLab("LB03");
		to.setRegSoft("RdT878U");
		to.setVagas(123);
		to.setValor(123.98);
		
	}
	
	@Test
	public void test00Carregar() {
	
		CursoTO fixture = new CursoTO();
		fixture.setCod("Info");
		fixture.setNome("Programacao");
		fixture.setDataIni("01/01/01");
		fixture.setDataTer("01/04/01");
		fixture.setHorario("09:09");
		fixture.setMaterial("Pendrive");
		fixture.setLivro("Deitel");
		fixture.setNumLab("LB03");
		fixture.setRegSoft("RdT878U");
		fixture.setVagas(123);
		fixture.setValor(123.98);
		
		CursoTO novo = dao.consultar("Info");
		novo.setCod("Info");
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		
		dao.cadastrar(to);
		CursoTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setNome("HTML");
		dao.alterar(to);
		CursoTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test03Excluir() {
		to.setNome(null);
		to.setDataIni(null);
		to.setDataTer(null);
		to.setHorario(null);
		to.setMaterial(null);
		to.setLivro(null);
		to.setNumLab(null);
		to.setRegSoft(null);
		to.setVagas(0);
		to.setValor(0.0);
		dao.deletar(to);
		CursoTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("testa inclusao", novo, to);
	}

}

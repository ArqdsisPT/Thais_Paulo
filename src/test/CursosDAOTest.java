package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import dao.AlunosDAO;
import dao.CursosDAO;
import to.AlunosTO;
import to.CursosTO;

public class CursosDAOTest {
	CursosDAO dao;
	CursosTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new CursosDAO();
		to = new CursosTO();
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
	
		CursosTO fixture = new CursosTO();
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
		
		CursosTO novo = dao.consultar("Info");
		novo.setCod("Info");
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		
		dao.cadastrar(to);
		CursosTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setNome("HTML");
		dao.alterar(to);
		CursosTO novo = dao.consultar(to.getCod());
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
		CursosTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("testa inclusao", novo, to);
	}

}

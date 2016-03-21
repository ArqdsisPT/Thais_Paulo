package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.AlunosDAO;
import to.AlunosTO;
import to.CursosTO;

public class AlunosDAOTest {
	AlunosDAO dao;
	AlunosTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new AlunosDAO();
		to = new AlunosTO();
		to.setNome("Paulo");
		to.setCpf(122345);
		to.setEnd("Rua Ico");
		to.setRg("12324x");
		to.setEmail("php@php.com");
		to.setTel(1234567);
		
	}
	
	@Test
	public void test00Carregar() {
	
		AlunosTO fixture = new AlunosTO();
		fixture.setNome("Mila");
		fixture.setCpf(132434);
		fixture.setRg("1321425x");
		fixture.setEnd("Rua nova");
		fixture.setEmail("mila@mila.com");
		fixture.setTel(112324355);
		
		AlunosTO novo = dao.consultar(132434);
		novo.setCpf(132434);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		dao.cadastrar(to);
		AlunosTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setEmail("mila.mila@mila.com");
		dao.alterar(to);
		AlunosTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test03Excluir() {
		to.setNome(null);
	    to.setEmail(null);
	    to.setEnd(null);
	    to.setRg(null);
	    to.setTel(0);
		dao.deletar(to);
		AlunosTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}

}

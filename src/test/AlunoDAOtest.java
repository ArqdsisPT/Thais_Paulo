package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dao.AlunoDAO;
import to.AlunoTO;

public class AlunoDAOtest {
	AlunoDAO dao;
	AlunoTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new AlunoDAO();
		to = new AlunoTO();
		to.setNome("Fabio");
		to.setCpf(4646464);
		to.setRg("12324x");
		to.setEmail("php@php.com");
		to.setTelefone("1234567");
}
	
	@Test
	public void test00Carregar() {
		AlunoTO fixture = new AlunoTO();
		fixture.setNome("Mila");
		fixture.setCpf(132434);
		fixture.setRg("1321425x");
		fixture.setEmail("mila@mila.com");
		fixture.setTelefone("112324355");
		
		AlunoTO novo = dao.consultar(132434);
		novo.setCpf(132434);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		dao.cadastrar(to);
		AlunoTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setEmail("mila.mila@mila.com");
		dao.alterar(to);
		AlunoTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test03Excluir() {
		to.setNome(null);
		to.setTelefone(null);
		to.setEndereco(null);
		to.setEmail(null);
		to.setRg(null);
	    
		dao.deletar(to);
		AlunoTO novo = dao.consultar(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}

}

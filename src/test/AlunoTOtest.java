package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import to.AlunoTO;

public class AlunoTOtest {

	AlunoTO to;
	@Before
	public void setUp() throws Exception {
		
		
	    to = new AlunoTO();	   
		to.setNome("Fabio");
		to.setTelefone("2626-9666");
		to.setEndereco("Rua Alexandre");
		to.setEmail("contato@contato");
		to.setRg("12324x");
		to.setCpf(122345);
		
	}

	@Test
	public void testGets() {
		assertEquals("getNome", to.getNome(), "Fabio");
		assertEquals("getTel", to.getTelefone(), "2626-9666");
		assertEquals("getEND", to.getEndereco(), "Rua Alexandre");
		assertEquals("getEmail", to.getEmail(),"contato@contato");
		assertEquals("getRG", to.getRg(), "12324x");
		assertEquals("getCPF", to.getCpf(), 122345);
	
	}
	
	@Test
	public void testEquals(){
		AlunoTO copia = new AlunoTO();
		copia.setNome(to.getNome());
		copia.setTelefone(to.getTelefone());
		copia.setEndereco(to.getEndereco());
		copia.setEmail(to.getEmail());
		copia.setRg(to.getRg());
		copia.setCpf(to.getCpf());
		assertEquals("teste to igual a copia", to, copia);
	}


}
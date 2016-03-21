package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import to.AlunosTO;

public class AlunosTOTest {

	AlunosTO to;
	@Before
	public void setUp() throws Exception {
		
		
	    to = new AlunosTO();	   
		to.setNome("Paulo");
		to.setCpf(122345);
		to.setEnd("Rua Ico");
		to.setRg("12324x");
		to.setEmail("php@php.com");
		to.setTel(1234567);
	}

	@Test
	public void testGets() {
		assertEquals("getNome", to.getNome(), "Paulo");
		assertEquals("getCPF", to.getCpf(), 122345);
		assertEquals("getEND", to.getEnd(), "Rua Ico");
		assertEquals("getRG", to.getRg(), "12324x");
		assertEquals("getEmail", to.getEmail(),"php@php.com");
		assertEquals("getTel", to.getTel(), 1234567);
	}
	
	@Test
	public void testEquals(){
		AlunosTO copia = new AlunosTO();
		copia.setNome(to.getNome());
		copia.setCpf(to.getCpf());
		copia.setRg(to.getRg());
		copia.setEmail(to.getEmail());
		copia.setTel(to.getTel());
		copia.setEnd(to.getEnd());
		assertEquals("teste to igual a copia", to, copia);
	}


}

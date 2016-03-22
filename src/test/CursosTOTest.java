package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import to.CursosTO;

public class CursosTOTest {
	CursosTO to;
	@Before
	public void setUp() throws Exception {
		
		
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
	public void testGets() {
		assertEquals("getCod", to.getCod(), "Info");
		assertEquals("getNome", to.getNome(),"Programacao");
		assertEquals("getData_Inicio", to.getDataIni(), "01/01/01");
		assertEquals("getData_Termino", to.getDataTer(), "01/04/01");
		assertEquals("getHorario", to.getHorario(),"09:09");
		assertEquals("getMaterial", to.getMaterial(), "Pendrive");
		assertEquals("getLivro", to.getLivro(),"Deitel");
		assertEquals("getNumLab", to.getNumLab(), "LB03");
		assertEquals("getRegSof", to.getRegSoft(), "RdT878U");
		assertEquals("getVagas", to.getVagas(), 123);
		assertEquals("getValor", to.getValor(), 123.98);
		
	}
	
	@Test
	public void testEquals(){
		CursosTO copia = new CursosTO();
		copia.setCod(to.getCod());
		copia.setNome(to.getNome());
		copia.setDataIni(to.getDataIni());
		copia.setDataTer(to.getDataTer());
		copia.setHorario(to.getHorario());
		copia.setMaterial(to.getMaterial());
		copia.setLivro(to.getLivro());
		copia.setNumLab(to.getNumLab());
		copia.setRegSoft(to.getRegSoft());
		copia.setVagas(to.getVagas());
		copia.setValor(to.getValor());
		
		assertEquals("teste to igual a copia", to, copia);
	}

}

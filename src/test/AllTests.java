package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@SuiteClasses({ AlunoDAOtest.class, AlunoTest.class, AlunoTOTest.class, CursoDAOTest.class, Cursotest.class, CursoTOtest.class ,
	//	ConnectionFactoryTest.class })

@SuiteClasses({ AlunoDAOtest.class, TestaAluno.class, AlunoTOtest.class,ConnectionFactoryTest.class })
public class AllTests {

}

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlunosDAOTest.class, AlunosTest.class, AlunosTOTest.class, CursosDAOTest.class, CursosTest.class, CursosTOTest.class ,
		ConnectionFactoryTest.class })
public class AllTests {

}

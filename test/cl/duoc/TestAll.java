package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 56964
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            TestCrear.class,
            TestModificar.class,
            TestBuscar.class,
            TestEliminar.class,
            TestMontoBono.class
        }
)
public class TestAll {
    
}

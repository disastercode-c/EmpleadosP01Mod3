package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestMontoBono {
    
     @Test
    public void testSubTotal() {
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleado = instance.Buscar("99999999");
        int cal = empleado.getAntiguedad()*50000;
        assertTrue(empleado.montoBono() == cal);
    }
}

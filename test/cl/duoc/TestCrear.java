package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestCrear {
    
    @Test
    public void testCrear() {
        System.out.println("Add");
        Empleado emp = new Empleado("17283508-2", "Carlos Huerta", 29, 10);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido= instance.Crear(emp);
        Assert.assertEquals(esperado, obtenido);
    }
}

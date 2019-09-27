package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instance = new BussEmpleado();
        Empleado empEditado = instance.Buscar("22222222");
        empEditado.setNombre("Ximena");
        boolean esperado = true;
        boolean obtenido = instance.Modificar(empEditado);
        Assert.assertEquals(esperado, obtenido);
    }
}

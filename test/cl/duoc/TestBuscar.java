package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestBuscar {
    
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "88888888";
        BussEmpleado instance = new BussEmpleado();
        String rutEsperado = rut;
        String rutObtenido = instance.Buscar(rut).getRut();
        Assert.assertEquals(rutEsperado, rutObtenido);
    }
    
}

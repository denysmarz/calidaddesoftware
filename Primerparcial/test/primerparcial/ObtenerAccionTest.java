/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package primerparcial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nayenys
 */
public class ObtenerAccionTest {
    
    public ObtenerAccionTest() {
    }
    

    @Test
    public void testAccion1() {
       
        String n = "si";
        Boolean x = true;
        String expResult = "actualizar";
        int result = ObtenerAccion.accion(n, x);
        assertEquals(expResult, result);
    }
    
}

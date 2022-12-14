/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package primerparcial;

import com.mycompany.parcial.ObtenerAccion;
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
        String result = ObtenerAccion.accion(n, x);
        assertEquals(expResult, result);
    }
    @Test
    public void testAccion2() {
       
        String n = "no";
        Boolean x = true;
        String expResult = "matricular";
        String result = ObtenerAccion.accion(n, x);
        assertEquals(expResult, result);
    }
    @Test
    public void testAccion3() {
       
        String n = "porConfirmar";
        Boolean x = true;
        String expResult = "actualizar";
        String result = ObtenerAccion.accion2(n, x);
        assertEquals(expResult, result);
    }
    @Test
    public void testAccion4() {
       
        String n = "externo";
        Boolean x = true;
        String expResult = "registrar";
        String result = ObtenerAccion.accion3(n, x);
        assertEquals(expResult, result);
    }
    @Test
    public void testAccion5() {
       
        String n = "vigente";
        Boolean x = true;
        String expResult = "matricular";
        String result = ObtenerAccion.accion2(n, x);
        assertEquals(expResult, result);
    }
    
}

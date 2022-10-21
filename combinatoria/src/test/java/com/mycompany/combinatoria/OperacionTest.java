/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.combinatoria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nayenys
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    
    @Test
    public void testNumeros() {
        //System.out.println("numeros");
        int n = 3;
        int x = 5;
        int expResult = 0;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNumeros2() {
        //System.out.println("numeros");
        int n = 3;
        int x = -5;
        int expResult = 0;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros3() {
        //System.out.println("numeros");
        int n = -3;
        int x = 5;
        int expResult = 0;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros4() {
        //System.out.println("numeros");
        int n = 3;
        int x = 0;
        int expResult = 0;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros5() {
        //System.out.println("numeros");
        int n = 4;
        int x = 1;
        int expResult = 4;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros6() {
        //System.out.println("numeros");
        int n = 5;
        int x = 2;
        int expResult = 10;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros7() {
        //System.out.println("numeros");
        int n = 7;
        int x = 3;
        int expResult = 35;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros8() {
        //System.out.println("numeros");
        int n = 4;
        int x = 4;
        int expResult = 1;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testNumeros10() {
        //System.out.println("numeros");
        int n = 1;
        int x = 1;
        int expResult = 1;
        int result = Operacion.numeros(n, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

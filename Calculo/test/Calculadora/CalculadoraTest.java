
package Calculadora;

import calculo.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabio
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // sumar
    @Test
    public void testSuma(){
    int resultado = Calculadora.suma(1014, 1200);
    int esperado = 2214; 
    assertEquals(esperado, resultado);       
    }        
      // conmutativa
    @Test
    public void testSumaConmutativa(){
    int resultado = Calculadora.suma(1200,1014 );
    int esperado = 2214; 
    assertEquals(esperado, resultado);       
    }   
    
}

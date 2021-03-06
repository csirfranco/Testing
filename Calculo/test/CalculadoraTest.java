


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
    // restar
    @Test
    public void testResta(){
    int resultado = Calculadora.resta(10,3 );
    int esperado = 7; 
    assertEquals(esperado, resultado);       
    }
     // Test resta minuendo
   @Test
    public void testRestaMinuendo(){
    int resultado = Calculadora.resta(3, 10);
    int esperado = -7; 
    assertEquals(esperado, resultado);       
    }
    
    //Distributiva
    @Test
    public void testDistributiva(){
    int resultado = Calculadora.distributiva(2, 6, 4);
    int esperado = 20; 
    assertEquals(esperado, resultado);    
    }
    //Expresion1
    @Test
    public void testExpresion1(){
        int resultado = Calculadora.expresion1(2, 3, 1, 4);
        int esperado = 9;
        assertEquals(esperado, resultado);        
    }
    
    //Expresion2 los parentesis se resuelven prmero
    @Test
    public void testExpresion2(){
        int resultado = Calculadora.expresion2(2, 3, 1, 4);
        int esperado = 25;
        assertEquals(esperado, resultado);        
    }
    @Test
    public void testDivision(){
        int resultado;
        int espera;
    resultado=Calculadora.divi(24, 12);
    espera=2;
    assertEquals(resultado,espera);
    }
      @Test(expected = ArithmeticException.class) 
    public void testDivPorCero(){
    Calculadora.divi(5, 0);
    }
}

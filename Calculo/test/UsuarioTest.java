/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Bianchetti
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
    @Test
      public void testlogin(){
          Usuario.login("nombreUser", "abdn");
      }
   
    @Test
      public void testSolicitudCalc(){
          Usuario.solicitarCalc("Jorge", "alumno",15);
      }

   
   @Test 
     public void testSolicitudCalcAlumno(){
         Usuario.solicitarCalc("Manuel", "alumno", 4);
     }
}

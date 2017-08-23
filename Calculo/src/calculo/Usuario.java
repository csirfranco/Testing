
package calculo;


public class Usuario {
    
    //Variable estatica para indicar el minimo de nivel para ingresar a la calculadora
public static int nivelMinCalc;


public static void login(String a, String b){
            int cadena = b.length();
            if (cadena >= 8){
                System.out.println("Ha ingresado al sistema ");
            }
            else {
                System.out.println("Error en la constraseña");
                
            }
     }

    public static void  configurarNivelMinimo (int n){
            if (n<0) 
                System.out.println("el nivel minimo no es  correcto");
            else
               nivelMinCalc=n;
                System.out.println("el nivel minimo se a configurado correcto");
        
    }      


//Codigo de solicitud de calculadora
public static void solicitarCalc(String usuario,String cargo,int nivel){
            String carg = cargo;
            if ("profesor".equals(carg)){
                System.out.println("CAlculadora ingresada");
            }
            else {
            int niv = nivel;    
                if (niv >= nivelMinCalc){
                System.out.println("calculadora ingresada , es alumno y posee el nivel necesario");
            }
                else {
                System.out.println("calculadora no ingresada , no es profesor y no alcanza el nivel minimo");   
                }
        }

    
}    
}   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

public class Calculadora {
	

public static int suma (int a, int b){
      return a + b;
    }
public static int resta (int a, int b){
      return a - b;
    }
    
public static int multi (int a, int b){
            return (a*b);
    }

public static int divi (int a, int b){
            return (a/b);
        }
	
public static int distributiva(int a, int b, int c){
    int resDistributiva = a*(b+c);
return resDistributiva;
}

public static int expresion1 (int a, int b, int c, int d){
    int resExpresion1 = a+b*c+d;
    return resExpresion1;
}

public static int expresion2 (int a, int b, int c, int d){
    int resExpresion2 = (a+b)*(c+d);
    return resExpresion2;
}

}

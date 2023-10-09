/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable;

/**
 *
 * @author Elias
 */
public class Numeros {
    
    public static int getParteEntera(double numero){
        
        String cadena = numero + ""; //convertir el numero en cadena
        //pillar caracteres desde el inicio hasta el .
        String entero = cadena.substring(0, cadena.indexOf("."));
        return Integer.parseInt(entero);
    }
    public static int getParteDecimal(double numero){
        
        String cadena = numero + ""; //convertir el numero en cadena
        //pillar caracteres desde el . hasta el final de la cadena de dcimales
        String decimal = cadena.substring( cadena.indexOf(".")+1);
        return Integer.parseInt(decimal);
    }
    
    
}

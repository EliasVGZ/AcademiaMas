package entregable;

import static entregable.Numeros.getParteDecimal;
import static entregable.Numeros.getParteEntera;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author Elias
 */

/**
 * 
 * 
 * COMENTO ESTE MAIN SINO ME COMPILA EESTE
 
public class main {
    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        Trabajador trabajador1 = new Trabajador("pepe", 35, 2, 2);
        System.out.println(trabajador1.toString());
        
        //metodo calculador sueldo
        double sueldo=trabajador1.calcularSueldo();
        System.out.println("el sueldo de: "+trabajador1.getNombre()+ " es:"+sueldo);
        
        //viendo si funcion cesar funciona
        String cadenaOriginal = "HOLA MUNDO";
        String cadenaCifrada = trabajador1.cifradoCesar(cadenaOriginal);
        
        System.out.println("cadena original: "+cadenaOriginal);
        System.out.println("cadena cifrada: "+cadenaCifrada);
        
        //metodos parteEnter, parteDecimal
        System.out.println("escribe un numero con enteros y decimales");
        double numero = Double.parseDouble(br.readLine());
        
        int opcion = 0;
        while(opcion != 3){
            System.out.println("--MENU--");
            System.out.println("1. obtener parte entera");
            System.out.println("2. obtener parte decimal");
            System.out.println("3. salir");
            
            System.out.println("elige una opcion");
            opcion = Integer.parseInt(br.readLine());
            
            switch(opcion){
                case 1:
                    int parteEntera = getParteEntera(numero);
                    System.out.println("la parte entera es: "+parteEntera);
                    break;
                case 2:
                    int parteDecimal = getParteDecimal(numero);
                    System.out.println("la parte decimal es: "+parteDecimal);
                    break;
                case 3:
                    System.out.println("saliendo del menu");
                    break;
                default:
                    System.out.println("opcion no valida, elige otra opcion");
                    
            }
        }
        
        //EJERCICIO 4
        /*
        System.out.println("Nombre persona 1: ");
        String n1 = br.readLine();
        System.out.println("fecha nacimiento persona 1 (dd/mm/aaaa): ");
        String fechaNacimiento1 = br.readLine();
        
        Personas p1 = new Personas(n1, fechaNacimiento1);
        
        
        System.out.println("Nombre persona 2");
        String n2 = br.readLine();
        System.out.println("fecha nacimiento persona 2 (dd/mm/aaaa):");
        String fechaNacimiento2 = br.readLine();
        
        
        Personas p2 = new Personas(n2, fechaNacimiento2);
        
        int edadPersona1 = p1.calcularEdad();
        int edadPersona2 = p2.calcularEdad();
            
        
        System.out.println("La edad de "+p1.getNombre()+ " es "+edadPersona1);
        System.out.println("La edad de "+p2.getNombre()+ "es "+edadPersona2);
        
        if (edadPersona1 == edadPersona2){
            System.out.println("ambos tienen la misma edad");
        }
        else if (edadPersona1 < edadPersona2){
            System.out.println(p1.getNombre()+ "es menor y tiene "+edadPersona1);
        }else if (edadPersona2 < edadPersona1){
            System.out.println(p2.getNombre()+ " es menor y tiene "+edadPersona2);
        }
        

        
        //EJERCICIO 5
        
        
        Hora hora = new Hora(5, 23);
        System.out.println("hora: "+hora.getHora());
        System.out.println("minutos "+hora.getMinuto());
        
    }
    
}


* @author Elias
 */
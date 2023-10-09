/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregable;
import java.lang.Math;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author a22eliassvf
 */
public class Trabajador {
    
    public static final int CAT_EMPLEADO = 0;
    public static final int CAT_ENCARGADO = 1;
    public static final int CAT_DIRECTIVO = 2;
    public static final int ANT_NOVATO = 0;
    public static final int ANT_MADURO = 1;
    public static final int ANT_EXPERTO = 2;
    public static final double SUELDO_BASE = 607;
    
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, int categoria, int antiguedad) throws Exception {
        if (categoria <0 || categoria >2){
            throw new IllegalArgumentException("categoria debe estar entre 0 y 2");
        }
        else{
            this.categoria=categoria;
        }
        if (antiguedad <0 || antiguedad > 2){
            throw new IllegalArgumentException("la categoria debe estar entre 0 y 2");
        }else{
            this.antiguedad = antiguedad;
        }
        this.nombre = nombre;
        this.edad = edad;
        
        
        //comprobarCategoria();
        //comprobarAntiguedad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad <0 || edad > 100){
            throw new Exception("Edad no valida");
        }else{
            this.edad = edad;
        }
        
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) throws Exception {
        if (categoria <0 || categoria >2){
            throw new Exception("categoria no valida");
        }else{
            this.categoria = categoria;
        }
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) throws Exception {
        if (antiguedad <0 || antiguedad >2){
            throw new Exception("antiguedad no valida");
        }else{
            this.antiguedad = antiguedad;
        }
        
    }
    
    private void comprobarCategoria(){
        if (categoria <0 || categoria >2){
            throw new IllegalArgumentException("la categoria debe estar entre 0 y 2");
        }
    }
    private void comprobarAntiguedad(){
        if (antiguedad <1 || antiguedad > 2){
            throw new IllegalArgumentException("la categoria debe estar entre 0 y 2");
        }
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", edad=" + edad + ", categoria=" + categoria + ", antiguedad=" + antiguedad + '}';
    }
    
    
    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo = SUELDO_BASE;
        
        switch(this.categoria) {
            case CAT_EMPLEADO:
                sueldo += 0.15 * SUELDO_BASE;
                break;
            case CAT_ENCARGADO:
                sueldo+= 0.35 * SUELDO_BASE;
                break;
            case CAT_DIRECTIVO:
                sueldo+=0.6 * SUELDO_BASE;  
                break;
        }
        switch(this.antiguedad){
            case ANT_NOVATO:
                sueldo+=150;
                break;
            case ANT_MADURO:
                sueldo+=300;
                break;
            case ANT_EXPERTO:
                sueldo+=600;
                break;
        }
        return sueldo;
    }
    
    
    public String cifradoCesar(String cadenaAcifrar){
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String textoCodificado = "";
 
        cadenaAcifrar = cadenaAcifrar.toUpperCase();

        char caracter;
        for (int i = 0; i < cadenaAcifrar.length(); i++) {
            caracter = cadenaAcifrar.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + 3) % letras.length() );
            }

        }
 
        return textoCodificado;
        
    }
    
    
 
}

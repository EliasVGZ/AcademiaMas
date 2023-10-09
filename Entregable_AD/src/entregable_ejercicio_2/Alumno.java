/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_ejercicio_2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elias
 */
public class Alumno implements Serializable{
    
    private String nombre;
    private String localidad;
    private ArrayList<Modulo> modulos;
    private ArrayList<Alumno>alumnos;

    public Alumno() {
    }

    
    
    public String getInfo() {
        String info = "";
        for (Modulo mod : modulos) {
            info += mod.getNombre() + "\n";
        }
        return info;
    }


    

    public Alumno(String nombre, String localidad, ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public double getNumeroHoras(){
        
        //creo la variable donde se va a guardar las hras
        int totalHoras=0;
        
        //recorro los objetos de la clase modulo y sumo las horas
        for(Modulo modulo:modulos){
            totalHoras+=modulo.getHoras();
        }
        return totalHoras;
    }

    
    
    
    
    
    
}

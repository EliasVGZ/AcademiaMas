/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_2;

import java.util.ArrayList;

/**
 *
 * @author a22eliassvf
 */
public class Alumno {
    
    private String nombre;
    private String localidad;
    private ArrayList<Modulo> modulos;

    public Alumno() {
    }

    public Alumno(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = new ArrayList<Modulo>();
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
    
    
    public void anadirModulo(Modulo a){
        modulos.add(a);
    }
    
    
    /** NO SÉ HACERLO
    public String[] getNombreModulos(){
        return modulos;
    }**/
    
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

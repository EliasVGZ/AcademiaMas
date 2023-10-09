/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_ejercicio_2;

import java.io.Serializable;

/**
 *
 * @author a22eliassvf
 */
public class Modulo implements Serializable{
    
    private String nombre;
    private int horas;
    private int unidades;

    public Modulo() {
    }

    public Modulo(String nombre, int horas, int unidades) {
        this.nombre = nombre;
        this.horas = horas;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Modulo{" + "nombre=" + nombre + ", horas=" + horas + ", unidades=" + unidades + '}';
    }
    
    
    
   
    
    
}

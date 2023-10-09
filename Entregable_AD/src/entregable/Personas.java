/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Elias
 */
public class Personas {
    
    private String nombre;
    private String fechaNacimiento;

    public Personas() {
    }

    public Personas(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad() {
        
        
        LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
        
        
    }

    
}

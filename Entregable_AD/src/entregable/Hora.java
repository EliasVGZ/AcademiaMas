/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable;

/**
 *
 * @author Elias
 */
public class Hora {
    
    private int hora;
    private int minuto;

    public Hora() {
    }

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Hora{" + "hora=" + hora + ", minuto=" + minuto + '}';
    }
    
    
    //TODO NO LO ENTIENDO
    public void inc(){
     
    }
    
    public boolean setMinutos(int valor){
        
        if (valor >= 0 && valor <=59){
            this.minuto = valor;
            return true;
            
            
        }else{
            return false;
        }
    }
    
    public boolean setHoras(int valor){
        
        if (valor >= 0 && valor <=23){
            this.minuto = valor;
            return true;
            
            
        }else{
            return false;
        }
    }
    
    
    
    
    

    
    
    
    
}

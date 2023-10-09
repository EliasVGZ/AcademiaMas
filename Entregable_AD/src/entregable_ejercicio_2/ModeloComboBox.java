/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_ejercicio_2;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Elias
 */
public class ModeloComboBox {
    
    private DefaultComboBoxModel<Modulo> modelo = new DefaultComboBoxModel<>();

    public DefaultComboBoxModel<Modulo> getModelo() {
        return modelo;
    }

    public void agregarModulo(Modulo modulo) {
        modelo.addElement(modulo);
    }
    
    
}

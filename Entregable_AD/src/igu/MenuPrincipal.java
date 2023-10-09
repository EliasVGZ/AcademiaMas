/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import entregable_ejercicio_2.Alumno;
import static entregable_ejercicio_2.MainAlumnado.cargarAlumnos;
import static entregable_ejercicio_2.MainAlumnado.cargarModulos;
import static entregable_ejercicio_2.MainAlumnado.guardarAlumnos;
import static entregable_ejercicio_2.MainAlumnado.guardarModulos;
import entregable_ejercicio_2.Modulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Elias
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Modulo> listaModulos;

   
    public MenuPrincipal(ArrayList<Modulo> listaModulos,ArrayList<Alumno> listaAlumnos) {
        
        this.listaAlumnos = listaAlumnos;
        this.listaModulos = listaModulos;
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVerAlumno = new javax.swing.JButton();
        btnAnhadirModulo = new javax.swing.JButton();
        btnAnadirAlumno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCargarAlumnos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCargarModulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerAlumno.setText("VER ALUMNO");
        btnVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlumnoActionPerformed(evt);
            }
        });

        btnAnhadirModulo.setText("AÑADIR MODULO");
        btnAnhadirModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhadirModuloActionPerformed(evt);
            }
        });

        btnAnadirAlumno.setText("AÑADIR ALUMNO");
        btnAnadirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnadirAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnAnhadirModulo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnVerAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(btnAnadirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnAnhadirModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVerAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jMenu1.setText("ALUMNOS ");

        jCargarAlumnos.setText("Cargar Alumnos");
        jCargarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jCargarAlumnos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MODULOS");

        jCargarModulos.setText("Cargar Modulos");
        jCargarModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarModulosActionPerformed(evt);
            }
        });
        jMenu2.add(jCargarModulos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void btnAnhadirModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhadirModuloActionPerformed
        
        JDAñadirModulo pantallaModulo = new JDAñadirModulo(this,true, this.listaModulos);
        pantallaModulo.setVisible(true);
        pantallaModulo.setLocationRelativeTo(null);
          
    }//GEN-LAST:event_btnAnhadirModuloActionPerformed

    
     public void añadirModulo(Modulo a){
        listaModulos.add(a);
    }
    
    public Alumno buscarAlumno(String nombre){
        
        for(Alumno alumno:listaAlumnos){
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                return alumno;
            }
        }
        return null; //si no se encuentra
        
        
    }
    
    
    
    private void btnAnadirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAlumnoActionPerformed
        
        JDAñadirAlumno anhadirAlumno = new JDAñadirAlumno(this,true, this.listaModulos,this.listaAlumnos);
        anhadirAlumno.setVisible(true);
        anhadirAlumno.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnAnadirAlumnoActionPerformed

    private void btnVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlumnoActionPerformed
     
       JDVerAlumno verAlumno = new JDVerAlumno(this,true, this.listaModulos,this.listaAlumnos);
        verAlumno.setVisible(true);
        verAlumno.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnVerAlumnoActionPerformed

    private void jCargarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarAlumnosActionPerformed
        // TODO add your handling code here:
        
        cargarAlumnos("alumnos.dat");
    }//GEN-LAST:event_jCargarAlumnosActionPerformed

    private void jCargarModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarModulosActionPerformed
        // TODO add your handling code here:
        cargarModulos("modulos.dat");
    }//GEN-LAST:event_jCargarModulosActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirAlumno;
    private javax.swing.JButton btnAnhadirModulo;
    private javax.swing.JButton btnVerAlumno;
    private javax.swing.JMenuItem jCargarAlumnos;
    private javax.swing.JMenuItem jCargarModulos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Modulo> getListaModulos() {
        return listaModulos;
    }

    public void setListaModulos(ArrayList<Modulo> listaModulos) {
        this.listaModulos = listaModulos;
    }

    public JButton getBtnAnadirAlumno() {
        return btnAnadirAlumno;
    }

    public void setBtnAnadirAlumno(JButton btnAnadirAlumno) {
        this.btnAnadirAlumno = btnAnadirAlumno;
    }

    public JButton getBtnAnhadirModulo() {
        return btnAnhadirModulo;
    }

    public void setBtnAnhadirModulo(JButton btnAnhadirModulo) {
        this.btnAnhadirModulo = btnAnhadirModulo;
    }

    public JButton getBtnVerAlumno() {
        return btnVerAlumno;
    }

    public void setBtnVerAlumno(JButton btnVerAlumno) {
        this.btnVerAlumno = btnVerAlumno;
    }
}

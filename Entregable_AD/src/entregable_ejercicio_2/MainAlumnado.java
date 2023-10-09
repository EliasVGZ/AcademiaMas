/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_ejercicio_2;
import igu.MenuPrincipal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Elias
 */
public class MainAlumnado {
    public static void main(String[] args) {
        
        //se cargan los modulos y alumnos
         ArrayList<Modulo> listaModulos = cargarModulos("modulos.dat");
         ArrayList<Alumno> listaAlumnos = cargarAlumnos("alumnos.dat");
                 
         MenuPrincipal pantalla = new MenuPrincipal(listaModulos, listaAlumnos);
         pantalla.setVisible(true);
         pantalla.setLocationRelativeTo(null); //CARGA LA PAGINA NUEVA EN EL CENTRO  
    }
    
    
    
        public static void guardarModulos(ArrayList<Modulo> modulos, String nombreArchivo) {
            String rutaArchivo = "src/entregable_ejercicio_2/archivos/" + nombreArchivo;
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
                out.writeObject(modulos);
            } catch (IOException e) {
                System.err.println("Error al guardar los módulos:");
                e.printStackTrace();
            }
        }

        public static ArrayList<Modulo> cargarModulos(String nombreArchivo) {
            String rutaArchivo = "src/entregable_ejercicio_2/archivos/" + nombreArchivo;
            ArrayList<Modulo> modulos = new ArrayList<>();
            
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
                modulos = (ArrayList<Modulo>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("error al cargar los modulos:");
                e.printStackTrace();

                // Intentar crear el archivo si no existe
                try {
                    File file = new File(rutaArchivo);
                    if (file.createNewFile()) {
                        System.out.println("se creo el archivo: " + rutaArchivo);
                    } else {
                        System.out.println("archivo ya existe.");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return modulos;
        }

        public static void guardarAlumnos(ArrayList<Alumno> alumnos, String nombreArchivo) {
            String rutaArchivo = "src/entregable_ejercicio_2/archivos/" + nombreArchivo;
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
                out.writeObject(alumnos);
            } catch (IOException e) {
                System.err.println("error al guardar los alumnos:");
                e.printStackTrace();
            }
        }

        public static ArrayList<Alumno> cargarAlumnos(String nombreArchivo) {
            String rutaArchivo = "src/entregable_ejercicio_2/archivos/" + nombreArchivo;
            ArrayList<Alumno> alumnos = new ArrayList<>();
            try (ObjectInputStream in = new ObjectInputStream(new
         FileInputStream(rutaArchivo))) {
                alumnos = (ArrayList<Alumno>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("error al cargar los alumnos:");
                e.printStackTrace();

                // Intentar crear el archivo si no existe
                try {
                    File file = new File(rutaArchivo);
                    if (file.createNewFile()) {
                        System.out.println("s creó el archivo: " + rutaArchivo);
                    } else {
                        System.out.println("el archivo ya existe.");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return alumnos;
        }
}

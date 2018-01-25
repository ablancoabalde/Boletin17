package boletin17ejer3;

import com.alberto.array.GeneradorArrays;
import com.alberto.mostrar.Mostrar;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Boletin17Ejer3 {

    public static void main(String[] args) {

        Metodos obx=new Metodos();

        Alumno[] lnum=obx.arrayAlumnoRam(1, 10);
        // Metodo que muestra el Array alumno
        Mostrar.mostrarlObject(lnum);
        System.out.println("Alumnos aprobados ");
// Buscar Nota de un Alumno
        obx.buscarlAlumno(lnum, JOptionPane.showInputDialog(null,"Nombre a buscar"));
// Mostrar los nombres de los alumnos aprobados
        if (obx.AproboNo(lnum)!=null) {
            Mostrar.mostrarlString(obx.AproboNo(lnum));
        } else {
            System.out.println("No hay alumnos aprobados");
        }
        System.out.println("Orden de las notas ");
// Mostrar Las notas ordenadas
        obx.listNotas(lnum);

    }

}

package boletin17ejer3;

import com.alberto.nRandom.GNRamdom;
import com.alberto.array.GeneradorArrays;
import com.alberto.mostrar.Mostrar;
import com.alberto.ordenar.Ordenar;

public class Metodos {

    public Alumno[] arrayAlumnoRam(int valoRam1, int valoRam2) {
        String[] nome={new String("Alberto"), new String("Luis"), new String("Tahía"), new String("Fran")};
        Alumno[] alumnos=new Alumno[nome.length];

        int nota;
        for (int i=0; i<nome.length; i++) {

            alumnos[i]=new Alumno(nome[i], GNRamdom.solo1NRamdom(valoRam1, valoRam2));
        }

        return alumnos;
    }

    public void buscarlAlumno(Alumno[] lnum, String nombre) {
        boolean encontrar=false;// Para saber si no encuentra el valor de la persona
        for (int i=0; i<lnum.length; i++) {
            if (lnum[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrar=true;
                System.out.println("Nota "+lnum[i].getNota()+" de "+lnum[i].getNombre());
            }
        }
        if (encontrar==false) {
            System.out.println("Alumno no encontrada");
        }
    }

    public String[] AproboNo(Alumno[] lAlumnos) {

        int lista=0, posicion=0;
        String[] alumAprob=new String[lista];

        for (int i=0; i<lAlumnos.length; i++) {
            if (lAlumnos[i].getNota()>5) {
                lista+=1;
                alumAprob=(String[]) GeneradorArrays.resizeArray(alumAprob, lista);
                alumAprob[posicion]=lAlumnos[i].getNombre();

                posicion+=1;
            }
        }

        return alumAprob;

    }
    
    public void listNotas(Alumno[] lAlumnos){
        
        int[] lNotas = new int[lAlumnos.length];
        
        for(int i=0; i<lAlumnos.length; i++){
            lNotas[i]= lAlumnos[i].getNota();
        }
        Ordenar.ordenar(lNotas);
         Mostrar.mostrarlnum(lNotas);
        
    }

}

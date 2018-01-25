package boletin17ejer2;

import com.alberto.array.GeneradorArrays;
import com.alberto.datos.Notas;
import com.alberto.mostrar.Mostrar;


public class Boletin17Ejer2 {

    public static void main(String[] args) {

        int[] lnum=GeneradorArrays.arrayintRandom(30, 1, 10);
        Mostrar.mostrarlnum(lnum);
        System.out.println(Notas.AproboNo(lnum));
        System.out.println("La media de la clase es "+ Notas.Notamedia(lnum));
        System.out.println("La nota más alta de la clase es "+Notas.NotaMasAlta(lnum));
        
        
    }

}

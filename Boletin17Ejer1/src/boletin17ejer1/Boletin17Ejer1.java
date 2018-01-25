package boletin17ejer1;

import com.alberto.mostrar.Mostrar;
import com.alberto.ordenar.Ordenar;

public class Boletin17Ejer1 {

    public static void main(String[] args) {

        int[] lnum=new int[6];
        ListaNum obx=new ListaNum();
        obx.arraynum(lnum);
        Ordenar.ordenar(lnum);
        Mostrar.mostrarlnum(lnum);
        System.out.println(" ");
        Ordenar.ordenarReverse(lnum);
        Mostrar.mostrarlnum(lnum);

    }

}

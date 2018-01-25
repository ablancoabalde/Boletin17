
package boletin17ejer1;

import com.alberto.nRandom.GNRamdom;

public class ListaNum {

    public int[] arraynum(int[] lnum) {
        for (int i=0; i<lnum.length; i++) {
            lnum[i]=GNRamdom.solo1NRamdom(1,50);

        }
        return lnum;
    }
}

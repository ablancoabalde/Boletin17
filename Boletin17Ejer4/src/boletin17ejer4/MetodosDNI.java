package boletin17ejer4;

public class MetodosDNI {

    public String calcLetDni(int dni) {

        LetraDNI[] letras={new LetraDNI("A", 3), new LetraDNI("B", 11), new LetraDNI("C", 20), new LetraDNI("D", 9), new LetraDNI("E", 22), new LetraDNI("F", 7),
             new LetraDNI("G", 4), new LetraDNI("H", 18), new LetraDNI("J", 13), new LetraDNI("K", 21),
             new LetraDNI("L", 19), new LetraDNI("M", 5), new LetraDNI("N", 12), new LetraDNI("P", 8), new LetraDNI("Q", 16), new LetraDNI("R", 1),
             new LetraDNI("S", 15), new LetraDNI("T", 0), new LetraDNI("V", 17), new LetraDNI("W", 2), new LetraDNI("X", 10), new LetraDNI("Y", 6),
             new LetraDNI("Z", 14)};

        for (int i=0; i<letras.length; i++) {
            if (letras[i].getNum()==dni%23) {
                return dni+letras[i].getLetra();
            }
        }
        return null;

    }

}

package boletin17ejer4;

import javax.swing.JOptionPane;

public class Boletin17Ejer4 {

    public static void main(String[] args) {
        MetodosDNI obx=new MetodosDNI();

        JOptionPane.showMessageDialog(null, obx.calcLetDni(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca DNI sin letra"))));

    }

}

package co.edu.unbosque.view;

import javax.swing.*;

public class Vista {

    public int menuPrincipal (){
        return Integer.parseInt(JOptionPane.showInputDialog(":: MENÚ PRINCIPAL ::\n\n" +
                "1. Buscar dato mediante busqueda binaria.\n" +
                "2. Buscar dato mediante busqueda ternaria.\n" +
                "3. Multiplicar matrices mediante fuerza bruta.\n" +
                "4. Multiplicar matrices mediante algoritmo Strassen.  \n" +
                "0. Salir."));
    }

    public int tomarDato (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public void mostrarMensaje (String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

}

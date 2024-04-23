package co.edu.unbosque.controller;

import co.edu.unbosque.model.Algoritmos;
import co.edu.unbosque.view.Vista;

import java.util.Arrays;

public class Main {
    public static void main (String args[]) {

        Vista ui = new Vista();
        Algoritmos md = new Algoritmos();
        int response = ui.menuPrincipal();
        do {
            switch (response) {
                case 1:
                    int tamanio = ui.tomarDato("Ingrese el tamaño del arreglo");
                    int[] array = md.rellenarArray(tamanio);
                    int target = ui.tomarDato("Ingrese el dato que quiere buscar");
                    Arrays.sort(array);
                    ui.mostrarMensaje("El arreglo generado es: " + Arrays.toString(array));
                    if (md.busquedaBinaria(array,target) == -1){
                        ui.mostrarMensaje("El dato no se encuentra en el arreglo");
                    } else {
                        ui.mostrarMensaje("El numero se encuentra en la posición: " +
                                "" + md.busquedaBinaria(array, target));
                    }
                    response = ui.menuPrincipal();
                    break;
                case 2:
                    int tamanio1 = ui.tomarDato("Ingrese el tamaño del arreglo");
                    int[] array1 = md.rellenarArray(tamanio1);
                    int target1 = ui.tomarDato("Ingrese el dato que quiere buscar");
                    if (md.busquedaTerciaria(array1,target1) == -1){
                        ui.mostrarMensaje("El dato no se encuentra en el arreglo");
                    } else {
                        ui.mostrarMensaje("El numero se encuentra en la posición: " +
                                "" + md.busquedaTerciaria(array1, target1));
                    }
                    response = ui.menuPrincipal();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    ui.mostrarMensaje("Opción incorrecta, seleccione una opción valida");
                    response = ui.menuPrincipal();
            }

        }while (response!=0);



    }
}

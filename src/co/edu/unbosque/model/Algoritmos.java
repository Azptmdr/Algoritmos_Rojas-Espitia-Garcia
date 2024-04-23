package co.edu.unbosque.model;

import java.util.Random;

public class Algoritmos {

    public int busquedaBinaria (int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

                // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // Target not found
        return -1;
    }

    public int busquedaTerciaria (int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target)
                return mid1;

            if (arr[mid2] == target)
                return mid2;

            if (target < arr[mid1])
                right = mid1 - 1;
            else if (target > arr[mid2])
                left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        return -1;
    }

    public void multiplicarMatricesFB (int matriz1[][],int matriz2[][]){

    }

    public void multiplicarMatricesStrassen (){

    }

    public int[] rellenarArray(int tamanio){
        int[] array = new int[tamanio];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1001);
        }
        return array;
    }
}

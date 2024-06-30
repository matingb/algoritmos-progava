package main;

import main.Grafos.*;
import main.Ordenamiento.ShellSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
            //Ejecucion Division y Conquista
        int[] elementos = {1, 2, 3, 4, 5};

        Sumar sumar = new Sumar();
        sumar.calcular(elementos);*/
/*
        // Ejecucuion ShellSort
        char[] lista = {'a', 's', 'o', 'r', 't', 'i', 'n', 'g', 'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        ShellSort shell = new ShellSort();
        shell.ordenar(lista);
        System.out.println(Arrays.toString(lista));
*/
        int[][] grafo_para_colorear = { {0, 1, 1, 0, 0},
                                        {1, 0, 1, 0, 0},
                                        {1, 1, 0, 1, 0},
                                        {0, 0, 1, 0, 1},
                                        {0, 0, 0, 1, 0}};
        
        int[] coloreo = ColoreoMatula.colorear(grafo_para_colorear);
        System.out.println("El coloreo resultante es:" + Arrays.toString(coloreo));
    }


}

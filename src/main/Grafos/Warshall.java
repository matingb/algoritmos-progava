package main.Grafos;

import java.util.Arrays;

public class Warshall {
    public static boolean[][] warshall(boolean[][] m) {
        int cantNodos = m.length;
        boolean[][] WarshallAnterior = new boolean [cantNodos][cantNodos];
        boolean[][] WarshallActual = new boolean[cantNodos][cantNodos];

        WarshallAnterior = m.clone();

        for (int k = 0; k < cantNodos; k++) {
            WarshallActual = WarshallAnterior.clone();
            for (int i = 0; i < cantNodos; i++) {
                for (int j = 0; j < cantNodos; j++) {
                    if ( i != k && j != k && i != j){
                        if(WarshallActual[i][j] || (WarshallAnterior[i][k] && WarshallAnterior[k][j])){
                            WarshallActual[i][j] = true;
                        }
                    }
                }

            }

            WarshallAnterior = WarshallActual.clone();
        }

        return WarshallActual;
    }
}

package main.Grafos;

public class Floyd {

	public static int[][] floyd(int[][] m) {
		int cantNodos = m.length;
		int[][] FloydAnterior = new int[cantNodos][cantNodos];
		int[][] FloydActual = new int[cantNodos][cantNodos];

		FloydAnterior = m.clone();

		for (int i = 0; i < cantNodos; i++) {
			FloydAnterior[i][i] = 0;
		}

		for (int k = 0; k < cantNodos; k++) {
			FloydActual = FloydAnterior.clone();
			for (int i = 0; i < cantNodos; i++) {
				for (int j = 0; j < cantNodos; j++) {
					if ( i != k && j != k && i != j){
						if(FloydAnterior[i][k] != Infinito.INFINITO && FloydAnterior[k][j] != Infinito.INFINITO &&
								FloydActual[i][j] > FloydAnterior[i][k] + FloydAnterior[k][j]){
							FloydActual[i][j] = FloydAnterior[i][k] + FloydAnterior[k][j];
					}
					}
				}

			}

			FloydAnterior = FloydActual.clone();
		}

		return FloydActual;
	}
}

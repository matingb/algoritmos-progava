package main.Grafos;

public abstract class Matriz {

	public static void imprimirMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == Infinito.INFINITO) {
					System.out.print("INF ");
				} else {
					System.out.print(m[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

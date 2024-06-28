package main.DivisionYConquista;

public class Sumar {
    public void calcular(int[] lista) {
        int total = calcular(lista, 0, lista.length-1);
        System.out.println(total);
    }

    public int calcular(int[] lista, int inicio, int fin) {
        if(inicio == fin)
            return lista[inicio];

        int mitad = (inicio + fin) / 2;
        int subTotalInferior = calcular(lista, inicio, mitad);
        int subTotalSuperior = calcular(lista, mitad + 1, fin);

        return subTotalInferior + subTotalSuperior;
    }
}

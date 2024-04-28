import java.util.List;

public class ColaConPrioridad {
    private int tope = 1;
    private int[] lista = new int[15];

    public void agregar(int elementoNuevo) {
        int posicionNuevo = tope;
        int padre = posicionNuevo / 2;
        int elementoAComparar = lista[padre];
        lista[posicionNuevo] = elementoNuevo;

        while(elementoNuevo < elementoAComparar && posicionNuevo != 1) {
            lista[posicionNuevo] = elementoAComparar;
            lista[padre] = elementoNuevo;
            posicionNuevo = padre;
            padre = posicionNuevo / 2;
            elementoAComparar = lista[padre];
        }
        tope++;
    }

    public int[] getLista() {
        return lista;
    }
}

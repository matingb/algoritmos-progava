public class ColaConPrioridad {
    private int tope = 1;
    private int[] lista = new int[15];

    public void agregar(int elementoNuevo) {
        int posicionNuevo = tope;
        int padre = posicionNuevo / 2;
        int elementoAComparar = lista[padre];
        lista[posicionNuevo] = elementoNuevo;

        while (elementoNuevo < elementoAComparar && posicionNuevo != 1) {
            lista[posicionNuevo] = elementoAComparar;
            lista[padre] = elementoNuevo;
            posicionNuevo = padre;
            padre = posicionNuevo / 2;
            elementoAComparar = lista[padre];
        }
        tope++;
    }

    public int desencolar() {
        if (tope == 1) {
            return -1;
        }
        int masPrioritario = lista[1];

        tope--;
        lista[1] = lista[tope];
        lista[tope] = 0;

        acomodarRaiz(1);
        return masPrioritario;
    }


    private void acomodarRaiz(int posicionRaiz) {
        int posicionHijoIzquiero = posicionRaiz * 2;
        boolean nohayHijoIzquierdo = posicionHijoIzquiero == tope;
        if (nohayHijoIzquierdo) {
            return;
        }

        int posicionRaizDerecho = posicionRaiz * 2 + 1;
        boolean noHayHijoDerecho = posicionRaizDerecho == tope;
        if (noHayHijoDerecho) {
            if (lista[posicionHijoIzquiero] < lista[posicionRaiz]) {
                intercambiar(posicionRaiz, posicionHijoIzquiero);
                acomodarRaiz(posicionHijoIzquiero);
            }
            return;
        }

        int hijoMenor = Math.min(lista[posicionHijoIzquiero], lista[posicionRaizDerecho]);
        int posicionMenor = lista[posicionHijoIzquiero] == hijoMenor ? posicionHijoIzquiero : posicionRaizDerecho;
        if (lista[posicionMenor] < lista[posicionRaiz]) {
            intercambiar(posicionRaiz, posicionMenor);
            acomodarRaiz(posicionHijoIzquiero);
        }
    }

    private void intercambiar(int posicionRaiz, int posicionHijoIzquiero) {
        int aux = lista[posicionRaiz];
        lista[posicionRaiz] = lista[posicionHijoIzquiero];
        lista[posicionHijoIzquiero] = aux;
    }

    public int[] getLista() {
        return lista;
    }
}

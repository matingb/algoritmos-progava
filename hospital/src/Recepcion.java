/*public class Recepcion {
    private int tope = 1;
    private final Paciente[] lista = new Paciente[15];

    public void recepcionarPaciente(Paciente elementoNuevo) {
        int posicionNuevo = tope;
        int padre = posicionNuevo / 2;
        Paciente elementoAComparar = lista[padre];
        lista[posicionNuevo] = elementoNuevo;

        while (elementoAComparar != null && elementoNuevo.getAfeccion().getPrioridad().getValor() < elementoAComparar.getAfeccion().getPrioridad().getValor() && posicionNuevo != 1) {
            lista[posicionNuevo] = elementoAComparar;
            lista[padre] = elementoNuevo;
            posicionNuevo = padre;
            padre = posicionNuevo / 2;
            elementoAComparar = lista[padre];
        }
        tope++;
    }

    public Paciente llamarPaciente() {
        if (tope == 1) {
            return null;
        }
        Paciente masPrioritario = lista[1];

        tope--;
        lista[1] = lista[tope];
        lista[tope] = null;

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
            if (lista[posicionHijoIzquiero].getAfeccion().getPrioridad().getValor() < lista[posicionRaiz].getAfeccion().getPrioridad().getValor()) {
                intercambiar(posicionRaiz, posicionHijoIzquiero);
                acomodarRaiz(posicionHijoIzquiero);
            }
            return;
        }

        Paciente hijoMenor = lista[posicionHijoIzquiero].getAfeccion().getPrioridad().getValor() > lista[posicionRaizDerecho].getAfeccion().getPrioridad().getValor() ? lista[posicionHijoIzquiero] : lista[posicionRaizDerecho];
        int posicionMenor = lista[posicionHijoIzquiero] == hijoMenor ? posicionHijoIzquiero : posicionRaizDerecho;
        if (lista[posicionMenor].getAfeccion().getPrioridad().getValor() < lista[posicionRaiz].getAfeccion().getPrioridad().getValor()) {
            intercambiar(posicionRaiz, posicionMenor);
            acomodarRaiz(posicionHijoIzquiero);
        }
    }

    private void intercambiar(int posicionRaiz, int posicionHijoIzquiero) {
        Paciente aux = lista[posicionRaiz];
        lista[posicionRaiz] = lista[posicionHijoIzquiero];
        lista[posicionHijoIzquiero] = aux;
    }

    public Paciente[] getLista() {
        return lista;
    }
}
*/

public class Recepcion {
    private int tope = 1;
    private final Paciente[] lista = new Paciente[15];

    public void recepcionarPaciente(Paciente elementoNuevo) {
        int posicionNuevo = tope;
        int padre = posicionNuevo / 2;
        Paciente elementoAComparar = lista[padre];
        lista[posicionNuevo] = elementoNuevo;

        while (elementoAComparar != null && elementoNuevo.compareTo(elementoAComparar) < 0 && posicionNuevo != 1) {
            lista[posicionNuevo] = elementoAComparar;
            lista[padre] = elementoNuevo;
            posicionNuevo = padre;
            padre = posicionNuevo / 2;
            elementoAComparar = lista[padre];
        }
        tope++;
    }

    public Paciente llamarPaciente() {
        if (tope == 1) {
            return null;
        }
        Paciente masPrioritario = lista[1];

        tope--;
        lista[1] = lista[tope];
        lista[tope] = null;

        acomodarRaiz(1);
        return masPrioritario;
    }

    private void acomodarRaiz(int posicionRaiz) {
        int posicionHijoIzquierdo = posicionRaiz * 2;
        boolean nohayHijoIzquierdo = posicionHijoIzquierdo >= tope;
        if (nohayHijoIzquierdo) {
            return;
        }

        int posicionRaizDerecho = posicionRaiz * 2 + 1;
        boolean noHayHijoDerecho = posicionRaizDerecho >= tope;
        if (noHayHijoDerecho) {
            if (lista[posicionHijoIzquierdo].compareTo(lista[posicionRaiz]) < 0) {
                intercambiar(posicionRaiz, posicionHijoIzquierdo);
                acomodarRaiz(posicionHijoIzquierdo);
            }
            return;
        }

        Paciente hijoMenor = lista[posicionHijoIzquierdo].compareTo(lista[posicionRaizDerecho]) > 0 ? lista[posicionHijoIzquierdo] : lista[posicionRaizDerecho];
        int posicionMenor = lista[posicionHijoIzquierdo] == hijoMenor ? posicionHijoIzquierdo : posicionRaizDerecho;
        if (hijoMenor.compareTo(lista[posicionRaiz]) < 0) {
            intercambiar(posicionRaiz, posicionMenor);
            acomodarRaiz(posicionHijoIzquierdo);
        }
    }

    private void intercambiar(int posicionRaiz, int posicionHijoIzquierdo) {
        Paciente aux = lista[posicionRaiz];
        lista[posicionRaiz] = lista[posicionHijoIzquierdo];
        lista[posicionHijoIzquierdo] = aux;
    }

    public Paciente[] getLista() {
        return lista;
    }
}

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ColaConPrioridad cola = new ColaConPrioridad();

        cola.agregar(5);
        cola.agregar(7);
        cola.agregar(15);
        cola.agregar(14);
        cola.agregar(9);
        cola.agregar(18);
        cola.agregar(6);
        cola.agregar(1);
        cola.agregar(13);
        cola.agregar(7);

        System.out.println(Arrays.toString(cola.getLista()));
    }

    private static int remover(List<Integer> lista) {
        int masPrioritario = lista.getFirst();

        lista.set(0,lista.getLast());
        lista.removeLast();

        return masPrioritario;
    }
}

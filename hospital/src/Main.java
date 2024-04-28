import java.util.Arrays;

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

        int elemento = cola.desencolar();

        System.out.println(elemento);
        System.out.println(Arrays.toString(cola.getLista()));
    }
}

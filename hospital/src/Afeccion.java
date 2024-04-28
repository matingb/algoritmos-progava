public class Afeccion {
    private final Prioridad prioridad;

    public Afeccion(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Afeccion{" +
                "prioridad=" + prioridad +
                '}';
    }
}

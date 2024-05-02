public class Afeccion {
    private final Prioridad prioridad;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Afeccion(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Afeccion{" +
                "nombre= " + nombre +
                "prioridad= " + prioridad +
                '}';
    }
}

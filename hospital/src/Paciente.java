public class Paciente {
    private Integer dni;
    private Afeccion afeccion;

    public Paciente(Integer dni, Afeccion afeccion) {
        this.dni = dni;
        this.afeccion = afeccion;
    }

    public Afeccion getAfeccion() {
        return afeccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni=" + dni +
                ", afeccion=" + afeccion +
                "}\n";
    }
}



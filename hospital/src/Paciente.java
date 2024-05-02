public class Paciente {
    private Integer dni;
    private Integer nroObraSocial;
    private Afeccion afeccion;

    public Paciente(Integer dni, Integer nroObraSocial, Afeccion afeccion) {
        this.dni = dni;
        this.nroObraSocial = nroObraSocial;
        this.afeccion = afeccion;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getNroObraSocial() {
        return nroObraSocial;
    }

    public void setNroObraSocial(Integer nroObraSocial) {
        this.nroObraSocial = nroObraSocial;
    }

    public Afeccion getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(Afeccion afeccion) {
        this.afeccion = afeccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni=" + dni +
                ", afeccion=" + afeccion +
                ", obra social" + nroObraSocial +
                "}\n";
    }
}



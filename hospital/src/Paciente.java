public class Paciente implements Comparable<Paciente>{
    private Integer dni;
    private Integer nroObraSocial;
    private Afeccion afeccion;

    public Paciente(Integer dni, Afeccion afeccion, Integer nroObraSocial) {
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
                "dni= " + dni +
                ", afeccion= " + afeccion.getNombre() +
                ", obra social= " + nroObraSocial +
                "}\n";
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        int prioridadThis = this.afeccion.getPrioridad().getValor();
        int prioridadOtro = otroPaciente.afeccion.getPrioridad().getValor();
        return Integer.compare(prioridadThis, prioridadOtro);
    }
}





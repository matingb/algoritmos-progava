import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Recepcion cola = new Recepcion();

        Afeccion afeccion1 = new Afeccion(Prioridad.RESUCITAR);
        Afeccion afeccion2 = new Afeccion(Prioridad.EMERGENCIA);
        Afeccion afeccion3 = new Afeccion(Prioridad.URGENCIA);
        Afeccion afeccion4 = new Afeccion(Prioridad.POCA_URGENCIA);
        Afeccion afeccion5 = new Afeccion(Prioridad.SIN_URGENCIA);


        Paciente paciente1 = new Paciente(123456789, afeccion1);
        Paciente paciente2 = new Paciente(987654321, afeccion2);
        Paciente paciente3 = new Paciente(555555555, afeccion3);
        Paciente mati = new Paciente(4264917, afeccion4);
        Paciente paciente5 = new Paciente(57657567, afeccion5);
        Paciente mottu = new Paciente(41898101, afeccion2);
        Paciente fede = new Paciente(43818997, afeccion3);

        cola.recepcionarPaciente(paciente1);
        cola.recepcionarPaciente(paciente2);
        cola.recepcionarPaciente(paciente3);
        cola.recepcionarPaciente(mati);
        cola.recepcionarPaciente(paciente5);
        cola.recepcionarPaciente(mottu);
        cola.recepcionarPaciente(fede);

        System.out.println(Arrays.toString(cola.getLista()));

        Paciente elemento = cola.siguentePaciente();

        System.out.println(elemento);
        System.out.println(Arrays.toString(cola.getLista()));
    }
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Recepcion recepcion = new Recepcion();

        Afeccion paroCardiaco = new Afeccion("Paro Cardiaco",Prioridad.RESUCITAR);
        Afeccion convulsionar = new Afeccion("Convulsionar",Prioridad.EMERGENCIA);
        Afeccion traumatismoDeCraneo = new Afeccion("Traumatismo de craneo",Prioridad.URGENCIA);
        Afeccion fiebre = new Afeccion("Fiebre",Prioridad.POCA_URGENCIA);
        Afeccion dolorDeGarganta = new Afeccion("Dolor de garganta",Prioridad.SIN_URGENCIA);

        Paciente ezequiel = new Paciente(123456789, paroCardiaco,121);
        Paciente federico = new Paciente(987654321, convulsionar,33333);
        Paciente brenda = new Paciente(555555555, traumatismoDeCraneo,11111);
        Paciente matias = new Paciente(4264917, fiebre,34234);
        Paciente agostina = new Paciente(57657567, dolorDeGarganta,5435345);
        Paciente francisco = new Paciente(41898101, convulsionar,95856);
        Paciente miguel = new Paciente(43818997, traumatismoDeCraneo, 53423);

        recepcion.recepcionarPaciente(ezequiel); //cola.encolar(ezequiel)
        recepcion.recepcionarPaciente(federico);
        recepcion.recepcionarPaciente(brenda);
        recepcion.recepcionarPaciente(matias);
        recepcion.recepcionarPaciente(agostina);
        recepcion.recepcionarPaciente(francisco);
        recepcion.recepcionarPaciente(miguel);

        System.out.println(Arrays.toString(recepcion.getLista()));

        Paciente pacienteMayorPrioridad = recepcion.llamarPaciente();
        System.out.println("\nEl paciente con mayor prioridad es:");
        System.out.println(pacienteMayorPrioridad);
        System.out.println(Arrays.toString(recepcion.getLista()));

        Paciente pacientePrioridad2 = recepcion.llamarPaciente();
        System.out.println("\nEl 2do paciente con mayor prioridad es:");
        System.out.println(pacientePrioridad2);
        System.out.println(Arrays.toString(recepcion.getLista()));

        Paciente pacientePrioridad3 = recepcion.llamarPaciente();
        System.out.println("\nEl 3ro paciente con mayor prioridad es:");
        System.out.println(pacientePrioridad3);
        System.out.println(Arrays.toString(recepcion.getLista()));

    }
}

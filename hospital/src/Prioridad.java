public enum Prioridad {
    RESUCITAR(1),
    EMERGENCIA(2),
    URGENCIA(3),
    POCA_URGENCIA(4),
    SIN_URGENCIA(5),
    ;
    private final int valor;

    Prioridad(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

package escobar_ayleen_proyecto.javaticket;

public enum TipoEvento {
    DEPORTIVO("Deportivo"),
    MUSICAL("Musical"),
    RELIGIOSO("Religioso");

    private final String tipo;

    TipoEvento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

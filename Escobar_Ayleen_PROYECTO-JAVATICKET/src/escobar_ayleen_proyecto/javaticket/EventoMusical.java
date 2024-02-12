package escobar_ayleen_proyecto.javaticket;

import java.util.Date;

public class EventoMusical extends Evento{
    private TipoMusica tipo;

    public EventoMusical(TipoMusica tipo, TipoEvento TipoEvent, int cod, int cantidadPersonas, String titulo, String descripcion, Date FechaRealizacion, double precio) {
        super(TipoEvent, cod, cantidadPersonas, titulo, descripcion, FechaRealizacion, precio);
        this.tipo = tipo;
    }
    
    @Override
    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public enum TipoMusica {
        POP, ROCK, RAP, CLASICA, REGGEATON, OTRO
    }
}

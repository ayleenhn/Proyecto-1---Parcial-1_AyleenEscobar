package escobar_ayleen_proyecto.javaticket;

import java.util.Date;

public class EventoReligioso extends Evento{
    private int PersonasConvertidas;

    public EventoReligioso(int PersonasConvertidas, TipoEvento TipoEvent, int cod, int cantidadPersonas, String titulo, String descripcion, Date FechaRealizacion, double precio) {
        super(TipoEvent, cod, cantidadPersonas, titulo, descripcion, FechaRealizacion, precio);
        this.PersonasConvertidas = PersonasConvertidas;
    }

    @Override
    public void mostrarDetalles() {
       
    }
}

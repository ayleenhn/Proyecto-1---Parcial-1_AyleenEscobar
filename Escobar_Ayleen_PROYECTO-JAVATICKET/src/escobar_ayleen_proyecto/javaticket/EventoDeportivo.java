package escobar_ayleen_proyecto.javaticket;

import java.util.ArrayList;
import java.util.Date;

public class EventoDeportivo extends Evento{
    private TipoDeporte deporte;
    private String Equipo1, Equipo2;
    private ArrayList<String> JugadoresEquipo1= new ArrayList<>();
    private ArrayList<String> JugadoresEquipo2= new ArrayList<>();

    public EventoDeportivo(String Equipo1, String Equipo2, TipoDeporte deporte, TipoEvento TipoEvent, int cod, int cantidadPersonas, String titulo, String descripcion, Date FechaRealizacion, double precio) {
        super(TipoEvent, cod, cantidadPersonas, titulo, descripcion, FechaRealizacion, precio);
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.deporte = deporte;
    }

    @Override
    public void mostrarDetalles() {
        
    }
    
    public enum TipoDeporte {
        FUTBOL,
        TENIS,
        RUGBY,
        BASEBALL
    }
}


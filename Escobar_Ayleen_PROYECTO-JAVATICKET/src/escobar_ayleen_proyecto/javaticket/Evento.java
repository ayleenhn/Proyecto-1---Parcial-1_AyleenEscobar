package escobar_ayleen_proyecto.javaticket;

import java.util.Date;

public abstract class Evento {
    private TipoEvento TipoEvent;
    private final int cod;
    private int cantidadPersonas;
    private String titulo, descripcion;
    private Date FechaRealizacion;
    private double precio;
    
    public abstract void mostrarDetalles();

    public Evento(TipoEvento TipoEvent, int cod, int cantidadPersonas, String titulo, String descripcion, Date FechaRealizacion, double precio) {
        this.TipoEvent = TipoEvent;
        this.cod = cod;
        this.cantidadPersonas = cantidadPersonas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.FechaRealizacion = FechaRealizacion;
        this.precio = precio;
    }

    public TipoEvento getTipoEvent() {
        return TipoEvent;
    }

    public void setTipoEvent(TipoEvento TipoEvent) {
        this.TipoEvent = TipoEvent;
    }

    public int getCod() {
        return cod;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRealizacion() {
        return FechaRealizacion;
    }

    public void setFechaRealizacion(Date FechaRealizacion) {
        this.FechaRealizacion = FechaRealizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
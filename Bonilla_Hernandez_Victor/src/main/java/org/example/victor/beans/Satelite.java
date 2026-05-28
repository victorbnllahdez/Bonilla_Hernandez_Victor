package org.example.victor.beans;

public class Satelite{
    private int id;
    private String nombre;
    private String orbita;
    private String peso;
    private String coste;
    private String activo;

    private Agencia agencia;
    private DetalleSatelite detalle;

    public int getId() {
        return id;
    }

    public Satelite(int id, String nombre, String orbita, String peso, String coste, String activo, Agencia agencia, DetalleSatelite detalle) {
        this.id = id;
        this.nombre = nombre;
        this.orbita = orbita;
        this.peso = peso;
        this.coste = coste;
        this.activo = activo;
        this.agencia = agencia;
        this.detalle = detalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCoste() {
        return coste;
    }

    public void setCoste(String coste) {
        this.coste = coste;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public DetalleSatelite getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleSatelite detalle) {
        this.detalle = detalle;
    }
}